package com.inhritance;

class Person
{
	private String name;
	private int age;
	Person()
	{
		
	}
	Person(String name, int age) 
	{
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Person name=" + name + ", age=" + age ;
	}
	
	
	
}
class Student extends Person
{
	private int rollNo;
	Student()
	{
		
	}
	Student(String name, int age, int rollNo)
	{
		super(name, age);
		this.rollNo = rollNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return super.toString()+" Student rollNo=" + rollNo;
	}
	
}


public class StudentTest {

	public static void main(String[] args) {
		
		Student s1=new Student("Arpita", 25, 1);
		Student s2=new Student("Reetu", 24, 2);
		Student s3=new Student("Pranali", 26, 3);
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
