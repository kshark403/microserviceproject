package com.example.microservices.account.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.microservices.account.model.TransactionDto;

@FeignClient("transactionservice")
public interface FeignProxy {
	
	@GetMapping("trans/search/{id}")
	public List<TransactionDto> searchTransactionByAccId(@PathVariable("id") int id);
	
	
}
