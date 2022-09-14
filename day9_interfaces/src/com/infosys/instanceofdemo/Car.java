package com.infosys.instanceofdemo;

public class Car extends Vehicle {

	@Override
	public void drive() {
		System.out.println("I am driving a car");

	}
	
	public void privateVehicle() {
		System.out.println("This is my private vehicle");
	}

}
