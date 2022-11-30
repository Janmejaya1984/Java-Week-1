package com.java.inheritancedemo;

public class Test {

	public static void main(String[] args) {
		RegularCustomer rCustomer = new RegularCustomer("R-001","John","987654321","New Delhi",10.0f);
		rCustomer.showDetails();
		Guest guest1 = new Guest("G-002","Foo","8796564324","Kolkata",30.0f);
		guest1.showDetails();
	}

}
