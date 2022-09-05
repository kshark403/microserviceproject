package com.example.microservices.branch.service;

import java.util.List;

import com.example.microservices.branch.model.Branch;

public interface BranchService {
	public List<Branch> getAllBranches();
	public Branch insertBranch(Branch branch);
	public String deleteBranch(int branchId);
	public List<Branch> searchBranchByName(String name);
	public Branch getBranchById(String id);
}
