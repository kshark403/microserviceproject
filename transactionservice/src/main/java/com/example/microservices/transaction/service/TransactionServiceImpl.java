package com.example.microservices.transaction.service;

import java.sql.Timestamp;
import java.util.List;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.example.microservices.transaction.model.Transaction;
import com.example.microservices.transaction.repo.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	private Logger logger = LoggerFactory.getLogger(TransactionServiceImpl.class); 
	
	@Autowired
	TransactionRepository repoTransaction;
	
	@Autowired private MongoTemplate mt;
	
//	@Autowired
//	private ReactiveMongoTemplate mt;
	
	@Override
	public List<Transaction> getAllTransactions() {
		return repoTransaction.findAll();
	}

	@Override
	public Transaction insertTransaction(Transaction cust) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		cust.setUpdDt(timestamp);
		
		logger.info("Transaction is exists?...");
		if( cust.getId() == null || "".equals(cust.getId() )) {
			logger.info("No " );
			cust.setCreateDt(timestamp);
		} else {
			Transaction tran = getTransactionById(cust.getId());
			cust.setCreateDt( tran.getCreateDt() );
			cust.setCreateBy(tran.getCreateBy());
		}
		return repoTransaction.save(cust);
	}

	@Override
	public String deleteTransaction(String id) {
//		ObjectId idObj = new ObjectId(id);
		
//		mt.remove(Transaction.class)
//        .matching(where("id").is(id))
//        .all()
//        .map(DeleteResult::getDeletedCount);
//		
		repoTransaction.deleteById(id);
//		repoTransaction.deleteByTransid(id);
		return "Record Deleted...";
	}
	
	@Override
	public List<Transaction> searchTransactionByCid(int id) {
		return repoTransaction.searchTransactionByCid(id);
	}

	@Override
	public Transaction getTransactionById(String id) {
		ObjectId idObj = new ObjectId(id);
		return mt.findById(idObj, Transaction.class);//.orElseThrow(IllegalStateException::new);
//		return repoTransaction.searchTransactionByTransid(id);
	}

	@Override
	public List<Transaction> searchTransactionByCreateBy(String createBy) {
		// TODO Auto-generated method stub
		return repoTransaction.searchTransactionByCreateBy(createBy);
	}
}
