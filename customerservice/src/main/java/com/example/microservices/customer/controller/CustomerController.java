package com.example.microservices.customer.controller;

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

import com.example.microservices.customer.model.AccountDto;
import com.example.microservices.customer.model.Customer;
import com.example.microservices.customer.model.TransactionDto;
import com.example.microservices.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Customer>> displayAll() {
		return new ResponseEntity<>(service.getAllCustomers(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer cust) {
		return new ResponseEntity<>(service.insertCustomer(cust), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") String id) {
		return new ResponseEntity(service.deleteCustomer(id), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") String id){
		return new ResponseEntity<>(service.getCustomerById(id), HttpStatus.OK);
	}
	
//	@GetMapping("/search/{name}")
//	public ResponseEntity<List<Customer>> searchCustomerByName(@PathVariable("name") String name) {
//		return new ResponseEntity<>(service.searchCustomerByName(name), HttpStatus.OK);
//	}
	
	@GetMapping("/search/transactions/{cid}")
	public ResponseEntity<List<TransactionDto>> searchTransactionsByCid(@PathVariable("cid")int cid){
		return new ResponseEntity<>(service.serachTransactionsForCustomerId(cid) ,HttpStatus.OK);
	}
	
	@GetMapping("/search/accounts/{cid}")
	public ResponseEntity<List<AccountDto>> searchAccountsByCustomerId(@PathVariable("cid")int cid){
		return new ResponseEntity<>(service.searchAccountsByCustomerId(cid) ,HttpStatus.OK);
	}
	
}
