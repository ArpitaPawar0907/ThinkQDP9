package com.interfacedemo;
abstract class Student implements Account
{
	int id;
	String name;
	Student()
	{
		
	}
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	abstract void display();
	public abstract void  deposite(int amt);
}
abstract class School extends Student
{
	String sname;
	School()
	{
		
	}
	School(int id ,String name,String sname)
	{
		
	}
}
public class Example {

}
