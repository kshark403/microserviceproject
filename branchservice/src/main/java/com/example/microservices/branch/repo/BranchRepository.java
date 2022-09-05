package com.example.microservices.branch.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.microservices.branch.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {

	@Query("select n from Branch n where n.branch_name=?1")
	public List<Branch> findByName(String branch_name);
	
}