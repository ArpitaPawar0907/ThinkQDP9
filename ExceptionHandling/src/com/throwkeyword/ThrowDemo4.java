package com.throwkeyword;

import java.util.Scanner;

public class ThrowDemo4 {
	
	static Scanner sc=new Scanner(System.in);
	public static void enterDetails()
	{
		System.out.println("Enter name :");
		String name=sc.next();
		
		System.out.println("Enter marks:");
		int marks=sc.nextInt();
		
		try
		{
		if(marks<0 || marks>100)
			throw new RuntimeException(" marks should be in between 0 to 100");
		
		   if(marks>40)
		   {
			System.out.println(name+" has cleared exam");
		   }
		   else
		   {
			   System.out.println(name+" has cleared exam");
		   }
		}
		catch (Exception e) {
		System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		enterDetails();
	}

}
