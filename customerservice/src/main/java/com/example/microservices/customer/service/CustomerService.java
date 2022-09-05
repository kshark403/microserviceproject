package com.example.microservices.customer.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.microservices.customer.model.AccountDto;
import com.example.microservices.customer.model.Customer;
import com.example.microservices.customer.model.TransactionDto;

public interface CustomerService {
	public List<Customer> getAllCustomers();
	public Customer insertCustomer(Customer cust);
	public String deleteCustomer(String custId);
	public List<Customer> searchCustomerByName(String name);
	public Customer getCustomerById(String id);
	public List<TransactionDto> serachTransactionsForCustomerId(int cid);
	public List<AccountDto> searchAccountsByCustomerId(@PathVariable("cid") int cid);
}
