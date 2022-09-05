package com.example.microservices.customer.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.microservices.customer.model.TransactionDto;

@FeignClient("transactionservice")
public interface FeignProxyTransaction {
	
	@GetMapping("trans/search/{cid}")
	public List<TransactionDto> searchTransactionByCid(@PathVariable("cid") int  cid);
	
}
