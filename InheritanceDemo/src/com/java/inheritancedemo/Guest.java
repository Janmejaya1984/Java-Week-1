package com.java.inheritancedemo;

public class Guest extends Customer {
float deliveryCharge;

public Guest() {
	System.out.println("Child(Guest) class Default constructor");
}



public Guest(String customerId, 
		String customerName, 
		String contactNumber, 
		String address,float deliveryCharge) {
	
	super(customerId, customerName, contactNumber, address);
	this.deliveryCharge = deliveryCharge;
	System.out.println("Child(Guest) class Parameterized constructor");
	
}


}
