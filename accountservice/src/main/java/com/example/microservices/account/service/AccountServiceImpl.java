package com.example.microservices.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.microservices.account.model.Account;
import com.example.microservices.account.model.TransactionDto;
import com.example.microservices.account.repo.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository repoAccount;
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	FeignProxy proxy;
	
	@Override
	public List<Account> getAllAccounts() {
		return repoAccount.findAll();
	}

	@Override
	public Account insertAccount(Account account) {
		return repoAccount.save(account);
	}

	@Override
	public String deleteAccount(int accountId) {
		repoAccount.deleteById(accountId);
		return "Record Deleted...";
	}

	@Override
	public List<Account> searchAccountByName(String name) {
		return repoAccount.findByName(name);
	}

	@Override
	public List<TransactionDto> searchTransForAccountId(int accId) {
//		return template.getForObject("http://TRANSACTIONSERVICE/trans/search/"+accId, List.class);
		
		return proxy.searchTransactionByAccId(accId);
	}
	
	@Override
	public Account getAccountById(String id) {
		return repoAccount.findById(Integer.parseInt(id)).orElseThrow(IllegalStateException::new);
	}

	@Override
	public List<Account> searchAccountByCustomerId(int cid) {
		return repoAccount.findByCid(cid);
	}

}
