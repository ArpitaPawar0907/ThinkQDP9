package com.arrayofobject;

public class Student {
	
	private int rollNo;
	private int age;
	private String name;
	private double marks;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, int age, String name, double marks) {
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", age=" + age + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
