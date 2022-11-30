package com.java.inheritancedemo;

public class Customer {
	String customerId;
	String customerName;
	String contactNumber;
	String address;
	public Customer() {
		System.out.println("No Arg constructor Of Parent Customer");
	}
	public Customer(String customerId, String customerName, String contactNumber, String address) {
		System.out.println("Parameterized constructor of Parent Customer class");
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void showDetails() {
		System.out.println("--Details of the Customer--");
		System.out.println("Customer ID: "+this.getCustomerId());
		System.out.println("Customer Name: "+this.getCustomerName());
		System.out.println("Customer Contact Number: "+this.getContactNumber());
		System.out.println("Customer Address: "+this.getAddress());
	}
	
}
