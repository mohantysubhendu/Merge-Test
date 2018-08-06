package com.subhendu.shoppingApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customers")
public class CustomerModel {
	@Id
	private String id;
	private String name;
	private String mobileNo;
	private String address;
	private String emailId;
	
 /*
	public CustomerModel(String id, String name, String mobileNo, String address, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.address = address;
		this.emailId = emailId;
	}*/
	/*public CustomerModel() {
		super();
	}*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
	
	
	
	
	
	
	
}
