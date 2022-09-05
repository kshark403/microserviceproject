package com.example.microservices.account.service;

import java.util.List;

import com.example.microservices.account.model.Account;
import com.example.microservices.account.model.TransactionDto;

public interface AccountService {
	public List<Account> getAllAccounts();
	public Account insertAccount(Account account);
	public String deleteAccount(int accountId);
	public List<Account> searchAccountByName(String name);
	public List<Account> searchAccountByCustomerId(int cid);
	public List<TransactionDto> searchTransForAccountId(int accId);
	public Account getAccountById(String id);
}
