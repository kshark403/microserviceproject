package com.example.microservices.account.model;

public class TransactionDto {
	
	int transid;
	
	int accid;
	
	String date_of_trans;
	
	String mode_of_trans;
	
	String trans_type;
	
	String trans_amount;
	
	public TransactionDto() {
		
	}


	public TransactionDto(int transid, int accid, String date_of_trans, String mode_of_trans, String trans_type,
			String trans_amount) {
		super();
		this.transid = transid;
		this.accid = accid;
		this.date_of_trans = date_of_trans;
		this.mode_of_trans = mode_of_trans;
		this.trans_type = trans_type;
		this.trans_amount = trans_amount;
	}


	public String getDate_of_trans() {
		return date_of_trans;
	}

	public void setDate_of_trans(String date_of_trans) {
		this.date_of_trans = date_of_trans;
	}

	public String getMode_of_trans() {
		return mode_of_trans;
	}

	public void setMode_of_trans(String mode_of_trans) {
		this.mode_of_trans = mode_of_trans;
	}

	public String getTrans_type() {
		return trans_type;
	}

	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}

	public String getTrans_amount() {
		return trans_amount;
	}

	public void setTrans_amount(String trans_amount) {
		this.trans_amount = trans_amount;
	}


	public int getTransid() {
		return transid;
	}


	public void setTransid(int transid) {
		this.transid = transid;
	}


	public int getAccid() {
		return accid;
	}


	public void setAccid(int accid) {
		this.accid = accid;
	}

	
}


