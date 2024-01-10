package com.oopsAssignment;

public class StudentQ9 {

	int roll_no;
	String name;
	float marks;
	float per;
	int age;
	 void getDetails(int r,String n,float m,float p,int a)
		{
			roll_no=r;
			name=n;
		    marks=m;
		    per=p;
		    age=a;
		}
		 void displayDetail()
		 {
			System.out.println("Name of Student: " +name);
			System.out.println("Roll No : "+roll_no);
			System.out.println("Marks : "+marks);
			System.out.println("Percentage : "+per);
			System.out.println("Age : "+age);
		 }
	
public static void main(String args[])
{
	
	StudentQ9 s1=new StudentQ9();
	StudentQ9 s2=new StudentQ9();
	s1.getDetails(12,"Rudra",334.8f, 57.6f, 10);
	s1.displayDetail();
	s2=s1;
	s2.displayDetail();
	System.out.println(s1);
	System.out.println(s2);
	

}
		
}

