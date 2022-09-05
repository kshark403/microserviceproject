package com.example.microservices.customer.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.microservices.customer.model.AccountDto;

@FeignClient("accountservice")
public interface FeignProxyAccount {
	
	@GetMapping("account/search/customer/{cid}")
	public List<AccountDto> searchAccountsByCustomerId(@PathVariable("cid") int cid);
	
}
