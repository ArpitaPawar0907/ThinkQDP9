package com.abstractclass;

abstract class Student
{
	int id;
	String name;
	float marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	 abstract void calper();
}
class SchoolStudent extends Student
{
      String schoolName;
      
	public SchoolStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SchoolStudent(int id, String name, float marks, String schoolName) {
		super(id, name, marks);
		this.schoolName = schoolName;
	}

	@Override
	void calper() {
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("SchoolNname:"+schoolName);
		System.out.println("Percentage:"+(marks/5));
		
	}
	
}
public class Question06 {

	public static void main(String[] args) {
		
		Student s;
		s=new SchoolStudent(1, "Sonali", 450, "SPPU");
		s.calper();

	}

}
