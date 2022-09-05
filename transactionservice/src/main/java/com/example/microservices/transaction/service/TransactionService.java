package com.example.microservices.transaction.service;

import java.util.List;

import com.example.microservices.transaction.model.Transaction;

public interface TransactionService {

	public List<Transaction> getAllTransactions();
	public Transaction insertTransaction(Transaction cust);
	public String deleteTransaction(String id);
	public List<Transaction> searchTransactionByCid(int id);
	public Transaction getTransactionById(String id);
	public List<Transaction> searchTransactionByCreateBy(String createBy);
}
