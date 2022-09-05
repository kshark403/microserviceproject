package com.example.microservices.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid", unique = true, nullable = false)
	int cid;
	
	@Column
	String firstname;
	
	@Column
	String middlename;
	
	@Column
	String lastname;
	
	@Column
	String city;
	
	@Column
	String contactno;
	
	@Column
	String occupation;
	
	@Column
	String dob;
	
	public Customer() {
		
	}


	public Customer(int cid, String firstname, String middlename, String lastname, String city, String contactno,
			String occupation, String dob) {
		super();
		this.cid = cid;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.city = city;
		this.contactno = contactno;
		this.occupation = occupation;
		this.dob = dob;
	}


	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}

	
}