package com.infosys.object.demo3;

import java.util.Objects;

public class Student1 {
private int roll;
private String name;
private int marks;
public Student1(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
}
@Override
public int hashCode() {
	return Objects.hash(marks, name, roll);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student1 other = (Student1) obj;
	return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
}

}
