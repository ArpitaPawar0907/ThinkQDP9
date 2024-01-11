package com.dec28;

import java.util.ArrayList;

public class Student {
	
	private int rollNo;
	private String name;
	ArrayList<Float> marks;
	private float per;
	private char grade;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, ArrayList<Float> marks, char grade) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	//	this.per = per;
		this.grade = grade;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Float> getMarks() {
		return marks;
	}
	public void setMarks(ArrayList<Float> marks) {
		this.marks = marks;
	}
	public float getPer() {
	float sum=0;
	for(float m:marks)
	{
		sum+=m;
	}
	per=sum/5;
		return per;
	}
	
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student " + rollNo + " " + name + " " + marks + " " + getPer() + " " + grade;
			
	}
	
	

}
