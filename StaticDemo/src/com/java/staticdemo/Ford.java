package com.java.staticdemo;

public class Ford {
	
	private String model;
	private String color;
	
	private static int noOfCars;
	
	public Ford(String model,String color) {
		System.out.println("Parameterized Constructor get called");
		this.model = model;
		this.color = color;
		noOfCars++;
	}
	
	public void showDetails() {
		System.out.println("Details of the Car");
		System.out.println("Model Is: "+this.model);
		System.out.println("Color Is: "+this.color);
	}
	
	public static Ford createCar(String model,String color) {
		Ford ford = new Ford(model,color);
		return ford;
	}
	public static int getCarCount() {
		return noOfCars;
	}

	public static void main(String[] args) {
		Ford ford1 = new Ford("Model-101","Red");
		Ford ford2 = new Ford("Model-102","Blue");
		Ford ford3 = new Ford("Model-103","White");
		Ford ford4 = new Ford("Model-104","Black");
		Ford ford5  = Ford.createCar("Model-105", "gray");
		ford1.showDetails();
		ford2.showDetails();
		ford3.showDetails();
		ford5.showDetails();
		System.out.println("Total No of Cars:"+ford1.getCarCount());
		System.out.println("Total No of Cars:"+ford2.getCarCount());
		System.out.println("Total No of Cars:"+ford3.getCarCount());
		System.out.println("Total No of Cars:"+Ford.getCarCount());

	}
	static {
		System.out.println("--Static block-1--");
	}
	
	static {
		System.out.println("--Static block-2--");
	}

}
