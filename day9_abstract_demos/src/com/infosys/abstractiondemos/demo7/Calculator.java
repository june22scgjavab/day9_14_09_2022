package com.infosys.abstractiondemos.demo7;

// abstract class can have instance variable also
public abstract class Calculator {
	private int num1;
	private int num2;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public abstract int calculate(int a,int b);
	// Abstract class can contain non-abstract method/methods also
	public void display() {
		System.out.println("I am concrete method in the abstract class");
	}

}
