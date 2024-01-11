package com.example;

import java.util.Scanner;

public class StudentGetterSetter {

	static Scanner sc=new Scanner(System.in);
	public static void insert(Student s)
	{
		System.out.println("Enter id:");
		s.setId(sc.nextInt());
		
		System.out.println("Enter name");
		s.setName(sc.next());
 
		System.out.println("Enter marks");
		s.setMarks(sc.nextDouble());
		
		
	}
	public static void display(Student s1[])
	{
		for(Student s:s1)
		{
			System.out.println(s);
		}
			
	}
	public static void main(String[] args) {
		
		Student st[]=new Student[3];
		for(int i=0;i<st.length;i++)
		{
			st[i]=new Student();
			insert(st[i]);
		}
 
		display(st);
	}

}
