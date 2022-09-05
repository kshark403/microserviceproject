package com.example.microservices.branch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservices.branch.model.Branch;
import com.example.microservices.branch.repo.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService {
	@Autowired
	BranchRepository repoBranch;
	
	@Override
	public List<Branch> getAllBranches() {
		return repoBranch.findAll();
	}

	@Override
	public Branch insertBranch(Branch branch) {
		return repoBranch.save(branch);
	}

	@Override
	public String deleteBranch(int branchId) {
		repoBranch.deleteById(branchId);
		return "Record Deleted...";
	}

	@Override
	public List<Branch> searchBranchByName(String name) {
		return repoBranch.findByName(name);
	}
	
	@Override
	public Branch getBranchById(String id) {
		return repoBranch.findById(Integer.parseInt(id)).orElseThrow(IllegalStateException::new);
	}
}
