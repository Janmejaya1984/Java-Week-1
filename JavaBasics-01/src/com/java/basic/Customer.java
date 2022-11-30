package com.java.basic;

public class Customer {
	//Member variables 
	//Instance Variable
	//Object Level Variable
	private int customerId;
	private String name;
	private boolean isMarried;
	
	public Customer() {
		System.out.println("Default Constructor of Customer class");
	}
	
	public Customer(int customerId,String name1,boolean isMarried) {
		System.out.println("Parameterized Constructor of Customer class");
		this.customerId = customerId;
		name = name1;
		this.isMarried = isMarried;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCustomerId() {
		return this.customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	public void display() {
		System.out.println("Details Of The Customer:");
		System.out.println("Name Of the customer is:"+this.name);
		System.out.println("ID Of the customer is:"+this.customerId);
		System.out.println("Is Married :"+this.isMarried);
	}

}
