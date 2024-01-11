package com.overriding;
class Person
{
	void display()
	{
		System.out.println("I am person");
	}
}
class Employee extends Person
{
	public void display()// same or increase visibility
	{
		super.display();
		System.out.println("I am employee");
	}
}

public class OverridingDemo {

	public static void main(String[] args) 
	{
		Person p1=new Person();
		Employee e1=new Employee();
		
		p1.display();
		e1.display();

	}

}
