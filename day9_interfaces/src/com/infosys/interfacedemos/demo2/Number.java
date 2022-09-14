package com.infosys.interfacedemos.demo2;

// We need to override all the methods
// of an interface and if we are not doing so 
// We have to make the class as an abstract class
// So in this case we are making Nnumber as an 
// abstract because number class is not implementing add method
public abstract class Number implements Calculator {

	
	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
