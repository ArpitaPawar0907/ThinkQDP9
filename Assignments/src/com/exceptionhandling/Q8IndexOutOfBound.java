package com.exceptionhandling;

import java.util.Scanner;

/*
 * 8. WAP to show the scenario in which IndexOutBound Exception (Both ArrayInexOutOfBound and 
StringIndexOutOfBound) exception is generated and handle this exceptio
 */
public class Q8IndexOutOfBound {

	static Scanner sc=new Scanner(System.in);
	public static void checkException()
	{
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter marks of five subjects");
		int marks[]=new int[5];
		for(int i=0;i<marks.length;i++)
			marks[i]=sc.nextInt();
		try
		{
			System.out.println("Strudent name");
			for(int i=0;i<=name.length();i++)
				System.out.print(name.charAt(i));
			
			System.out.println("Marks: ");
			for(int i=0;i<=marks.length;i++)
				System.out.println(marks[i]);
		}
		catch (IndexOutOfBoundsException e) {
			
			System.out.println(e+" occurs ");
		}
		
		
	}
	public static void main(String[] args) {
		
		checkException();

	}

}
