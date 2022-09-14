package com.infosys.abstractdemos.demo6;

public abstract class Calculator {
	public abstract int calculate(int a,int b);
	// Abstract class can contain non-abstract method/methods also
	public void display() {
		System.out.println("I am concrete method in the abstract class");
	}

}
