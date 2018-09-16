package com.spm.spmbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Companies")
public class CompanyReg {
	
	@Id
	private String cmpName;
	
	private String password;
	private int contact;
	private String email;
	private int fax;
	private String personInCharge;
	
	public String getCmpName() {
		return cmpName;
	}
	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getFax() {
		return fax;
	}
	public void setFax(int fax) {
		this.fax = fax;
	}
	public String getPersonInCharge() {
		return personInCharge;
	}
	public void setPersonInCharge(String personInCharge) {
		this.personInCharge = personInCharge;
	}
	
}
