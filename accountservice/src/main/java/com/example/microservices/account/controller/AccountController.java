package com.example.microservices.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.account.model.Account;
import com.example.microservices.account.model.TransactionDto;
import com.example.microservices.account.service.AccountService;

@RestController
@RequestMapping("/account")
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin
public class AccountController {

	@Autowired
	AccountService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Account>> displayAll() {
		return new ResponseEntity<>(service.getAllAccounts(), HttpStatus.OK);
	}
	
	@GetMapping("/search/customer/{cid}")
	public ResponseEntity<List<Account>> searchAccountsByCustomerId(@PathVariable("cid") int cid) {
		return new ResponseEntity<>(service.searchAccountByCustomerId(cid), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Account> saveAccount(@RequestBody Account cust) {
		return new ResponseEntity<>(service.insertAccount(cust), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteAccount(@PathVariable("id") int id) {
		return new ResponseEntity(service.deleteAccount(id), HttpStatus.OK);
	}
	
	@GetMapping("/search/trans/{accId}")
	public ResponseEntity<List<TransactionDto>> searchTransactionByAccId(@PathVariable("accId")int accId){
		return new ResponseEntity<>(service.searchTransForAccountId(accId), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Account> getAccountById(@PathVariable("id") String id){
		return new ResponseEntity<>(service.getAccountById(id), HttpStatus.OK);
	}
	
}