package com.exceptionhandling;
class Student1
{
	private int id;
	private String name;
	private int age;
	private double marks;
	public Student1() {
		// TODO Auto-generated constructor stub
	}
	public Student1(int id, String name, int age, double marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
}
public class Q22UserDefinedException {

	public static void main(String[] args) {
		
		
		Student1 s1[]=new Student1[5];
		s1[0]=new Student1(101, "Arpita", 25, 70);
		s1[1]=new Student1(102, "Reetu", 26, 60);
		s1[2]=new Student1(103, "Pooja", 23, 45);
		s1[3]=new Student1(104, "Riya", -2, 70);
		s1[4]=new Student1(105, "Prachi", 22, 50);
		for(int i=0;i<s1.length;i++) {
		try
		{
			if(s1[i].getAge()<0)
				throw new InvalidAgeException();
			System.out.println(s1[i]);
		}
		catch (RuntimeException e) {
			
			System.out.println(e);
		}
		}
	}

}
