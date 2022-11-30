package com.java.inheritancedemo;

public class Child extends Parent {
   static final int y=100;
	public Child() {
		this("John");
		System.out.println("D.C Of Child");	
	}

	public Child(String name) {
		super(name);
		System.out.println("P.C Of Child");
	}
	@Override
	public void showDetails(String star) {
		final int x;
		x =10;
		
		System.out.println("Show details method of Child");
		System.out.println(star.repeat(10));
	}
	@Override
	public String toString() {
		return "[String representation Of Child Class]"+super.toString();
	}

}
