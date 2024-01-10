package com.exceptionhandling;

import java.util.Scanner;

public class Q11TryValueFinalValue {

	static Scanner sc=new Scanner(System.in);
	public static void checkException()
	{
		
		String name;
		int rollNo;
		try
		{
			System.out.println("Try block");
			System.out.println("Enter name of Student ");
			name=sc.next();
			System.out.println("Enter roll no");
			rollNo=sc.nextInt();
			
		}finally {
			System.out.println("Finally block");
			System.out.println("Enter name of Student ");
			name=sc.next();
			System.out.println("Enter roll no");
			rollNo=sc.nextInt();
		
		}
		System.out.println("Name :"+name+" roll no:"+rollNo);
	}
	
	public static void main(String[] args) {
		
		checkException();
	}
}
