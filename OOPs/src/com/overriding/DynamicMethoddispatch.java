package com.overriding;
class MyPerson
{
	void display()
	{
		System.out.println("I am person");
	}
}
class MyEmployee extends MyPerson
{
	public void display()
	{
		
		System.out.println("I am employee");
	}
}
class Celebrity extends MyPerson
{
	public void display()
	{
		
		System.out.println("I am Celebrety");
	}
}

public class DynamicMethoddispatch {

	public static void main(String[] args) 
	{
		MyPerson p1=new MyPerson();
		MyEmployee e1=new MyEmployee();
		
		p1.display();
		e1.display();
        System.out.println("-------------------------------------");
		
        
        MyPerson p;
		
        p=new MyEmployee();
		p.display();
		
		p=new MyPerson();
		p.display();
		
		p=new Celebrity();
		p.display();
		
	}

}
