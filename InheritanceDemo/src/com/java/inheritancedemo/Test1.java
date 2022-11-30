package com.java.inheritancedemo;

public class Test1 {

	public static void main(String[] args) {
		Child child = new Child();
		child.showDetails("*");
		Parent parent = new Parent();
		parent.showDetails("#");
		parent = child;//Auto Boxing
		child = (Child)parent;//Unboxing
		child.showDetails("$");
		parent.showDetails("%");
		
		System.out.println("Printing Object:-----");
		System.out.println("Child:-----"+child);
	}

}
