package com.example.microservices.customer.model;

public class AccountDto {

	int account_id;
	
	int cid;
	
	int branch_id;
	
	String opening_balance;
	
	String account_type;
	
	String account_status;
	
	public AccountDto() {
		
	}

	public AccountDto(int cid, int branch_id, String opening_balance, String account_type,
			String account_status) {
		super();
		this.cid = cid;
		this.branch_id = branch_id;
		this.opening_balance = opening_balance;
		this.account_type = account_type;
		this.account_status = account_status;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public String getOpening_balance() {
		return opening_balance;
	}

	public void setOpening_balance(String opening_balance) {
		this.opening_balance = opening_balance;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getAccount_status() {
		return account_status;
	}

	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}

	public int getAccount_id() {
		return account_id;
	}
	
	
}