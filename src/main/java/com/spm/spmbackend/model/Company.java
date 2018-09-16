package com.spm.spmbackend.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "company")
public class Company {
	
	@Id
	private String cmpId;
	private String cmpName;
	private String password;
	private String contact;
	private String email;
	private String address;
	
	
	public String getCmpId() {
		return cmpId;
	}
	public void setCmpId(String cmpId) {
		this.cmpId = cmpId;
	}
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
