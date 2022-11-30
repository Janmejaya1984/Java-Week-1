package com.java.abstractdemo;

public class Truck extends Vehicle {

	public Truck(String vehicleNo, String model, String color) {
		super(vehicleNo, model, color);
		
	}

	@Override
	public void start() {
		System.out.println("Truck starts....");

	}

	@Override
	public void stop() {
		System.out.println("Truck stops....");

	}

}
