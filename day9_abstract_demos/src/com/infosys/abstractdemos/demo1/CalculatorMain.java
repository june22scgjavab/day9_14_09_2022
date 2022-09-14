package com.infosys.abstractdemos.demo1;

public class CalculatorMain {

	public static void main(String[] args) {
	// Reference is of base type and object
		// is of sub type
		Calculator calc=null;
		calc=new Addition();
		//int result=calc.calculate(3,3);
		//calc=new Subtraction();
// Can we write
		//result=calc.calculate(3,3);
		// We cannot write because we dont have 
		// any calculate method in the Parent class
	   Addition add=(Addition)calc;
	   System.out.println(add.calculate(4, 5));
	
	}

}
