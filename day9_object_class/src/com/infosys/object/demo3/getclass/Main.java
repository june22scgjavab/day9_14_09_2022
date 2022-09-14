package com.infosys.object.demo3.getclass;
/*
 * class com.infosys.object.demo3.getclass.Student
class com.infosys.object.demo3.getclass.StudentDetails
getClass returns an object of Class class type during the runtime
 */
public class Main {

	public static void main(String[] args) {
	Student student1=new Student(1,"Ram",80);
	StudentDetails student2=new StudentDetails(1,"Ram",80);
	System.out.println(student1.getClass());
	System.out.println(student2.getClass());
	}

}
