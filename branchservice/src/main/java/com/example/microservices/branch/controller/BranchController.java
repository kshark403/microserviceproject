package com.example.microservices.branch.controller;

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

import com.example.microservices.branch.model.Branch;
import com.example.microservices.branch.service.BranchService;

@RestController
@RequestMapping("/branch")
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin
public class BranchController {

	@Autowired
	BranchService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Branch>> displayAll() {
		return new ResponseEntity<>(service.getAllBranches(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Branch> saveBranch(@RequestBody Branch cust) {
		return new ResponseEntity<>(service.insertBranch(cust), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteBranch(@PathVariable("id") int id) {
		return new ResponseEntity(service.deleteBranch(id), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Branch> getBranchById(@PathVariable("id") String id){
		return new ResponseEntity<>(service.getBranchById(id), HttpStatus.OK);
	}
	
//	@GetMapping("/search/{name}")
//	public ResponseEntity<List<Branch>> searchBranchByName(@PathVariable("name") String name) {
//		return new ResponseEntity<>(service.searchBranchByName(name), HttpStatus.OK);
//	}
	
}