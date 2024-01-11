package com.containment;

import java.util.Scanner;

public class CollegeUserInput {
	static Scanner sc=new Scanner(System.in);

	public static void enterDetails(Student s)
	{
		System.out.println("Enter student id");
		s.setSid(sc.nextInt());
		
		System.out.println("Enter student name");
		s.setSname(sc.next());
		
		s.setCourse(new Course());
		System.out.println("Enter course id");
		s.getCourse().setCid(sc.nextInt());
		
		System.out.println("Enter course name");
		s.getCourse().setCname(sc.next());
		
		System.out.println("Enter fees");
		s.getCourse().setFees(sc.nextDouble());

	
	}
	public static void main(String[] args) {

      Student s1=new Student();
      Student s2=new Student();
      
      enterDetails(s1);
     enterDetails(s2);
     System.out.println(s1);
	  System.out.println(s2);
	}

}
