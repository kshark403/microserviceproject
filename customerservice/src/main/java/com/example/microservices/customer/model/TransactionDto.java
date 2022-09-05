package com.example.microservices.customer.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class TransactionDto {
	
	String id;
	
	int cid;
	
	int accId;
	
	String mode;
	
	String type;
	
	String amount;
	
	String createBy;
	
	Date createDt;
	
	String updBy;
	
	Date updDt;
	
	public TransactionDto() {
		
	}

	public TransactionDto(String id, int accId, String mode, String type, String amount, String createBy, Date createDt,
			String updBy, Date updDt) {
		super();
		this.id = id;
		this.accId = accId;
		this.mode = mode;
		this.type = type;
		this.amount = amount;
		this.createBy = createBy;
		this.createDt = createDt;
		this.updBy = updBy;
		this.updDt = updDt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public String getUpdBy() {
		return updBy;
	}

	public void setUpdBy(String updBy) {
		this.updBy = updBy;
	}

	public Date getUpdDt() {
		return updDt;
	}

	public void setUpdDt(Date updDt) {
		this.updDt = updDt;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

}


