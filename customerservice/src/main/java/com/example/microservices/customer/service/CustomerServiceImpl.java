package com.example.microservices.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservices.customer.model.AccountDto;
import com.example.microservices.customer.model.Customer;
import com.example.microservices.customer.model.TransactionDto;
import com.example.microservices.customer.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository repoCustomer;
	
	@Autowired
	FeignProxyTransaction proxyTrans;
	
	@Autowired
	FeignProxyAccount proxyAcc;
	
	@Override
	public List<Customer> getAllCustomers() {
		return repoCustomer.findAll();
	}

	@Override
	public Customer insertCustomer(Customer cust) {
		return repoCustomer.save(cust);
	}

	@Override
	public String deleteCustomer(String custId) {
		repoCustomer.deleteById(Integer.parseInt(custId));
		return "Record Deleted...";
	}
	
	@Override
	public List<Customer> searchCustomerByName(String name) {
		return repoCustomer.findByName(name);
	}
	
	@Override
	public Customer getCustomerById(String id) {
		return repoCustomer.findById(Integer.parseInt(id)).orElseThrow(IllegalStateException::new);
//		return repoCustomer.searchCustomerByTransid(id);
	}

	@Override
	public List<TransactionDto> serachTransactionsForCustomerId(int cid) {
		// TODO Auto-generated method stub
		
		return proxyTrans.searchTransactionByCid(cid);
	}

	@Override
	public List<AccountDto> searchAccountsByCustomerId(int cid) {
		return proxyAcc.searchAccountsByCustomerId(cid);
	}

}
