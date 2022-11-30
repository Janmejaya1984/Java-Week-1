package com.java.abstractdemo;

public class Test {

	public static void main(String[] args) {
		Car car = new Car("101","Nano","silver");
		car.start();
		car.stop();
		TwoWheeler pulsor = new TwoWheeler("102","Pulsor","black");
		pulsor.start();
		pulsor.stop();
		
		Vehicle vehicle = new Truck("103","Mahindra","red");
		vehicle.start();
		vehicle.stop();
	}

}
