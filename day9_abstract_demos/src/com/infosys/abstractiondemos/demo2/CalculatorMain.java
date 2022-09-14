package com.infosys.abstractiondemos.demo2;

public class CalculatorMain {

	public static void main(String[] args) {
	// Reference is of base type and object
		// is of sub type
		Calculator calc=null;
		calc=new Addition();
	    int result=calc.calculate(3, 4);
	   System.out.println(result);
	   calc=new Subtraction();
	   result=calc.calculate(3, 4);
	   System.out.println(result);
	}

}
