package com.ifelse;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		
		if(number%2==0)
		{
			System.out.println("Number is Even");
			if(number%6==0)
			{
				System.out.println("Number is divisible by 6");
			}
		}
		else
		{
			System.out.println("Number is odd");
			if(number%5==0)
			{
				System.out.println("number is divisible by 5");
			}
		}
		

	}

}
