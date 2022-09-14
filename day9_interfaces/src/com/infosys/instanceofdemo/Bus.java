package com.infosys.instanceofdemo;

public class Bus extends Vehicle {

	@Override
	public void drive() {
		System.out.println("I am in a bus");

	}
	
	public void publicTransport() {
		System.out.println("I am riding a public transport");
	}

}
