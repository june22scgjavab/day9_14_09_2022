package com.infosys.abstractiondemos.demo7;

//The type Addition must implement the inherited abstract method Calculator.calculate(int, int)
// It is mandatory to override the 
// abstract methods of the abstract
// class in the sub=classes
// otherwise it gives compilation error
// If we are not implementing the abstract
// method of the abstract in the sub-class
// declare the sub class also as an
// abstract which means our sub class
// Addition is also incomplete
public  class Addition extends Calculator{
public int calculate(int a,int b) {
		return a+b;
	}
}
