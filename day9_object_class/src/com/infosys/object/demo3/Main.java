package com.infosys.object.demo3;
// It is not true that if two objects are
// having same hashCode value , then they are
// equal ... We can see in the demo code
/*
 * 2646130
   2646130
   false

 */
public class Main {

	public static void main(String[] args) {
	Student1 student1=new Student1(1,"Ram",80);
	Student2 student2=new Student2(1,"Ram",80);
	System.out.println(student1.hashCode());
	System.out.println(student2.hashCode());
	System.out.println(student1.equals(student2));
	}

}
