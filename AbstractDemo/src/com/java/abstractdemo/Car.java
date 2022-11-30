package com.java.abstractdemo;

public class Car extends Vehicle {

	public Car(String vehicleNo, String model, String color) {
		super(vehicleNo, model, color);
	}

	@Override
	public void start() {
		System.out.println("Car starts....");
		
	}

	@Override
	public void stop() {
		System.out.println("Car stops....");
		
	}

}
