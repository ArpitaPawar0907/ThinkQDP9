package com.test1;

import java.util.Scanner;

public class Question14_PowerOfNthTerm {

	public static void powerOfDigit(int num)
	{ 
		int count=0;
		int original=num;
		long result=1;
		
		while(num>0)
		{
			count++;
			num=num/10;
			
		}
	   
		for(int i=1;i<=count;i++)
		{
			result=original*result;
		}
		
		System.out.println(count+" Power of "+original+" ="+result);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		powerOfDigit(n);
	}
}
