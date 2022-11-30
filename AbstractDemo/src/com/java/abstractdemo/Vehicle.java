package com.java.abstractdemo;

public abstract class Vehicle {
String vehicleNo;
String model;
String color;

public Vehicle(String vehicleNo, String model, String color) {
	super();
	this.vehicleNo = vehicleNo;
	this.model = model;
	this.color = color;
}
public abstract void start(); 
public abstract void stop();
}
