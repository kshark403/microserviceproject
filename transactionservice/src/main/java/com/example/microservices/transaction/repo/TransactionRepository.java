package com.example.microservices.transaction.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.microservices.transaction.model.Transaction;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, Integer> {
	@Query("select u from Transaction u where u.cid=?1")
	public List<Transaction> searchTransactionByCid(int accId);
	

	@Query("select u from Transaction u where u.createBy=?1")
	public List<Transaction> searchTransactionByCreateBy(String createBy);
		
//	@DeleteQsteByTransid(int id);

	@DeleteQuery
    void deleteById(String id);
}