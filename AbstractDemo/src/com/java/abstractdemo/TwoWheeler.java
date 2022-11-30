package com.java.abstractdemo;

public class TwoWheeler extends Vehicle {

	public TwoWheeler(String vehicleNo, String model, String color) {
		super(vehicleNo, model, color);
	}

	@Override
	public void start() {
		System.out.println("Two Wheeler starts....");
		
	}

	@Override
	public void stop() {
		System.out.println("Two Wheeler stops....");
		
	}

}
