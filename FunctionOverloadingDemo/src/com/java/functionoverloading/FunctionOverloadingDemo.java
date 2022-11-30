package com.java.functionoverloading;

public class FunctionOverloadingDemo {

	public FunctionOverloadingDemo() {
		this(100,"abc");
		System.out.println("Default Constructor of FunctionOverloadingDemo class");
	}
	public FunctionOverloadingDemo(int x) {
		
		System.out.println("parameterized Constructor of FunctionOverloadingDemo class taking one Integer arg.");
	}
	public FunctionOverloadingDemo(String x) {
		this(100);
		System.out.println("parameterized Constructor of FunctionOverloadingDemo class taking one String arg.");
	}
	public FunctionOverloadingDemo(int x,String y) {
		this("abc");
		System.out.println("parameterized Constructor of FunctionOverloadingDemo class taking one Integer and one String arg.");
	}
	public static void main(String[] args) {
		
		FunctionOverloadingDemo obj1 = new FunctionOverloadingDemo();
	}

}
