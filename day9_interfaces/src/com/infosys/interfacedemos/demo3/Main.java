package com.infosys.interfacedemos.demo3;


// We cannot create an object of interface
// but we can create a reference variable
// of interface and store the object's reference
// of the class which has implemented the interface
public class Main {

	public static void main(String[] args) {
		Calculator calc=new Number();
		System.out.println(calc.add(3, 4));
		System.out.println(calc.subtract(4, 1));
		// Because the multiply method is not present in Calculator
		//System.out.println(calc.multiply(3,4));
		Calculator2 calc2=new Number();
		System.out.println(calc2.add(1, 3));
		System.out.println(calc2.subtract(4, 1));
		System.out.println(calc2.multiply(2, 3));
		System.out.println(calc2.divide(4, 2));
		
	}

}
