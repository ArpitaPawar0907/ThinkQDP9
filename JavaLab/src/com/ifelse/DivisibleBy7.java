package com.ifelse;

import java.util.Scanner;

public class DivisibleBy7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		if(number%7==0)
		{
			System.out.println("number is divisible by 7");
		}
		else
		{
			int rem=7-(number%7);
			
			System.out.println("add "+rem+" to "+number+"divisible by 7");
		}
		
			
	
		

	}

}
