package com.abstractDemo;

abstract class Person
{
	String name;
	String adhar;
	Person()
	{
		
	}
	Person(String name,String adhar)
	{
		this.name=name;
		this.adhar=adhar;
	}
	abstract void display();
	//abstract static void showAddress();
	
	//abstract final void printData();  we cannot create abstract method final 
	                                    //we need to make implementation in child class
	                                    //final method are cannot inherited
	static void showCourse()
	{
		System.out.println("ThinkQ");
		
	}
	final void showFee()
	{
		System.out.println("Fees: 35000");
	}
	
}
class Student extends Person
{
	int rollNo;
	double marks;
	Student()
	{
		
	}
	Student(String name,String adhar,int rollNo,double marks)
	{
		super(name,adhar);
		this.rollNo=rollNo;
		this.marks=marks;
	}
     
	public void calculatePer()
	{
		System.out.println("Percentage:"+(marks/5));
	}
	@Override
	void display() {
		System.out.println("Student");
		System.out.println("Name:"+name);
		System.out.println("Adhar "+adhar);
		System.out.println("Roll no:"+rollNo);
		System.out.println("Marks :"+marks);
		
		
	}
	
}
public class PersonTest {

	public static void main(String[] args) {
	
		
		
		
		Student s1=new Student("Pooja","344567543",2,450);
		Person.showCourse();
		s1.display();
		s1.calculatePer();
		Person p;
		p=new Student("Arpita","345653342",1,554);
         p.showFee(); 
		p.display();
	}

}
