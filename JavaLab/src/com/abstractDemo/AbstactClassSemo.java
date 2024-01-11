package com.abstractDemo;

abstract class Student

{
	protected int rollNo;
	protected String name;
	
	public Student()
	{
		System.out.println("Constructor of abstraact class");
		
	}
	public Student(int rollNo,String name)
	{
		this.name=name;
		this.rollNo=rollNo;
		System.out.println("parameterized constructor of abstract class");
		
	}
	abstract void calculatePer();
	
	public void display()
	{
	System.out.println("Name :"+name);
	System.out.println("roll no:"+rollNo);
	}
	
	
}
class SchoolStudent extends Student
{

	String scName;
	float totalmarks;
	float per;
	public SchoolStudent() {
         super();
         System.out.println("Child class default constructor");
         
	}
	SchoolStudent(int rollNo,String name,String scName,float totalmarks)
	{
		super(rollNo,name);
		this.scName=scName;
		this.totalmarks=totalmarks;
		System.out.println("Child class Constructor");
	}
	@Override
	void calculatePer() {
		per=totalmarks/5;
		System.out.println("Percentage:"+per);
		System.out.println("This is abstract method");
		
	}
	void show()
	{
		System.out.println("School name:"+scName);
		System.out.println("Percentage"+per);
	}
	
}
public class AbstactClassSemo {

	public static void main(String[] args) {
		
		SchoolStudent s=new SchoolStudent();
		System.out.println("-----------------------------------");
		SchoolStudent s1=new SchoolStudent(1, "Arpita", "SSVM", 357);
		System.out.println("--------------------------------------");
		s1.display();
		s1.calculatePer();
		s1.show();
		
		
		

	}

}
