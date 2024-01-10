package com.staticandfinalkeyword;

import java.util.Scanner;

public class SumOfNumber {
	static Scanner sc=new Scanner(System.in);
	
	public static void sum(int num)
	{
	 int result=0;
	 for(int i=1;i<=num;i++)
	 {
		 System.out.println("Enter number to be added");
		 int n1=sc.nextInt();
		 result=result+n1;
	 }
	 System.out.println("Addition of "+num+" number "+result);
	}

	public static void main(String[] args) {
	
		
		System.out.println("Enter no of integer");
		int n=sc.nextInt();
		
		sum(n);

	}

}
