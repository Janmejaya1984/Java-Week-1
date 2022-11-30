package com.java.inheritancedemo;

public class RegularCustomer extends Customer {
float discount;

public RegularCustomer() {
	System.out.println("Default Constructor of Child RegularCustomer");
}

public RegularCustomer(String customerId, 
		String customerName, 
		String contactNumber, String address,float discount) {
	super(customerId, customerName, contactNumber, address);
	
	this.discount = discount;
	System.out.println("Parameterized Constructor of Child RegularCustomer");
}

public float getDiscount() {
	return discount;
}

public void setDiscount(float discount) {
	this.discount = discount;
}

}
