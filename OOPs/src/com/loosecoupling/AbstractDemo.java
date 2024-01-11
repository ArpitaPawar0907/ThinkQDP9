package com.loosecoupling;



abstract class Student
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
}
class SchoolStudent extends Student
{
	public SchoolStudent() {
		// TODO Auto-generated constructor stub
	}

	public SchoolStudent(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void display() {
	System.out.println("School Student");
	
		
	}
	
}
class CollegeStudent extends Student
{
	public CollegeStudent() {
		// TODO Auto-generated constructor stub
	}

	public CollegeStudent(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void display() {
	
	System.out.println("College student");
		
	}
	
}

public class AbstractDemo {

	public void display(Student s)
	{
		System.out.println(s.id+" "+s.name);
	}
	public static void main(String[] args) {
		
		AbstractDemo obj=new AbstractDemo();
		Student s1;
		s1=new SchoolStudent(1,"Arpita");
		obj.display(s1);
		s1=new CollegeStudent(2, "Pranay");
		
		obj.display(s1);
		

	}

}
