package com.infosys.abstractiondemos.demo7;

public class CalculatorMain {

	public static void main(String[] args) {
	// Reference is of base type and object
		// is of sub type
		Calculator calc=null; // We cannot create
		// an object of abstract class 
		// but we can create a reference variable
		// of abstract class
		// We cannot write line 13
		// because abstract classes are incomplete
		//Calculator calc2=new Calculator();
		calc=new Addition();
		calc.setNum1(1); // We are calling the concrete method of the abstract class
		calc.setNum2(2); // We are calling the concrete method of the abstract class
	    int result=calc.calculate(3, 4);
	   System.out.println(result);
	   calc.display();
	}

}
