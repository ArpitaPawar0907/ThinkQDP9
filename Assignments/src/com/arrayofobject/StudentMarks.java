package com.arrayofobject;

import java.util.Scanner;

import com.arrayassignment1.MyEmployee;

public class StudentMarks {

	 static Scanner sc=new Scanner(System.in);
	 
	 public static void enterDetsils(Student s)
	 {
		  System.out.println("Enter name");
		  s.setName(sc.next());
		  
		  System.out.println("Enter roll no");
		  s.setRollNo(sc.nextInt());
		  
		  System.out.println("Enter Age");
		  s.setAge(sc.nextInt());
		  
		  System.out.println("Enter marks ");
		  s.setMarks(sc.nextDouble());
	 }
	 
	 public static void printMarks(Student s[])
	 {
		 for(int i=0;i<s.length;i++)
		 {
			 if(s[i].getMarks()<60 && s[i].getMarks()>15)
				 System.out.println(s[i]);
		 }
	 }
	 public static void display(Student s[])
		{
			for(Student s1:s)
			{
				System.out.println(s1);
			}
		}
	public static void main(String[] args) {

		Student s1[]=new Student[5];
//		for(int i=0;i<s1.length;i++)
//		{
//			s1[i]=new Student();
//			enterDetsils(s1[i]);
//		}
		s1[0]=new Student(1, 25,"Arpita", 55);
		s1[1]=new Student(2, 23,"Pooja", 60);
		s1[2]=new Student(3, 22,"Nisha", 14);
		s1[3]=new Student(4, 24,"Reetu", 30);
		s1[4]=new Student(5, 25,"Pranay", 70);
		display(s1);
		System.out.println("--------------------------------");
		printMarks(s1);
     sc.close();
	}
   
}
