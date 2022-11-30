package com.java.inheritancedemo;

public class Parent {

	public Parent() {
		
		System.out.println("D.C of Parent");
	}
	public Parent(String name) {
		this();
		System.out.println("P.C of Parent"+name);
	}
	
	public  void showDetails(String star) {
		System.out.println("Show details method of Parent");
		System.out.println("here is the star :"+star);
	}

}
