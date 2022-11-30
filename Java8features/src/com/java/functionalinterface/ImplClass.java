package com.java.functionalinterface;

public class ImplClass implements FunctionalInterfaceDemo {

	@Override
	public void square(int x) {
		System.out.println("The Square is : "+(x*x));

	}

}
