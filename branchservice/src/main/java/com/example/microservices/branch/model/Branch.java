package com.example.microservices.branch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="branch")
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_id", unique = true, nullable = false)
	int branch_id;
	
	@Column
	String branch_name;
	
	@Column
	String branch_city;
	
	public Branch() {
		
	}

	public Branch(String branch_name, String branch_city) {
		super();
		this.branch_name = branch_name;
		this.branch_city = branch_city;
	}

	public int getBranch_id() {
		return branch_id;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getBranch_city() {
		return branch_city;
	}

	public void setBranch_city(String branch_city) {
		this.branch_city = branch_city;
	}
}