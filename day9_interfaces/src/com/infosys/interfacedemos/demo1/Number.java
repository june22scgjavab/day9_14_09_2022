package com.infosys.interfacedemos.demo1;

// We need to override all the methods
// of an interface
public class Number implements Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	} 

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
