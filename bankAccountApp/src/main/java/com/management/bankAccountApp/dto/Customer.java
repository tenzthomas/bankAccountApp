package com.management.bankAccountApp.dto;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private int id;
	private String name;
	private String username;
	private String password;
	private String address;
	private String country;
	private String state;
	private String email;
	private String pan;
	private String contact;
	private String dob;
	private String accountType;
	
	 public Customer() {
	    }

     public Customer(int id, String name, String username, String password, String address, String state, String country,
    		String email,String pan, String contact, String dob, String accountType) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.state = state;
        this.country = country;
        this.email = email;
        this.pan = pan;
        this.contact = contact;
        this.dob = dob;
        this.accountType = accountType;
    }
	    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
}
