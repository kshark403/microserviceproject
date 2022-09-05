package com.example.microservices.account.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.microservices.account.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

	@Query("select n from Account n where n.account_type=?1")
	public List<Account> findByName(String account_type);
	
	@Query("select n from Account n where n.cid=?1")
	public List<Account> findByCid(int cid);
}
