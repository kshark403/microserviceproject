package com.example.microservices.transaction.controller;

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

import com.example.microservices.transaction.model.Transaction;
import com.example.microservices.transaction.service.TransactionService;

@RestController
@RequestMapping("/trans")
//@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:8765"})
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin
public class TransactionController {

	@Autowired
	TransactionService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Transaction>> displayAll() {
		return new ResponseEntity<>(service.getAllTransactions(), HttpStatus.OK);
	}

	@GetMapping("/search/{cid}")
	public ResponseEntity<List<Transaction>> searchTransactionByCid(@PathVariable("cid") int cid){
		return new ResponseEntity<>(service.searchTransactionByCid(cid), HttpStatus.OK);
	}
	
	@GetMapping("/createBy/{createBy}")
	public ResponseEntity<List<Transaction>> searchTransactionByCreateBy(@PathVariable("createBy") String createBy){
		return new ResponseEntity<>(service.searchTransactionByCreateBy(createBy), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Transaction> getTransactionById(@PathVariable("id") String id){
		return new ResponseEntity<>(service.getTransactionById(id), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Transaction> saveTransaction(@RequestBody Transaction cust) {
		return new ResponseEntity<>(service.insertTransaction(cust), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteTransaction(@PathVariable("id") String id) {
		return new ResponseEntity(service.deleteTransaction(id), HttpStatus.OK);
	}
	

	
}