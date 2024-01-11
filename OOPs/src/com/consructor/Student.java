package com.consructor;

public class Student {
   
	int id;
	String name;
	float marks;
	Student()
	{
		id=1;
		name="Arpita";
		marks=33;
	}
	Student(int id,String name)
	{  this();
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+"  "+name+"  "+marks;
	}
	public static void main(String[] args) {
		
		Student s1=new Student();
		System.out.println(s1);
		
		Student s2=new Student(2,"Pranay");
		System.out.println(s2);

	}

}
