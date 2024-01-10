package com.thisconstructorchaining;

public class Student {
	private int id;
	private String name;
	Student()
	{
		
	}
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;// if we remove this it will give warning assigmment has no effect
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String toString() {
		return "Student id:" + id + " name:" + name ;
	}
     
	
	
	public static void main(String[] args) {

		Student s1=new Student();
		Student s2=new Student();
		//int i;
		//this.i=1;
		s1.id=10;
		s2.id=20;
	
	}
}
