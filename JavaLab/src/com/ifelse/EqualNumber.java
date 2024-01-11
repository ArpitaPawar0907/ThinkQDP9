package com.ifelse;

import java.util.Scanner;

public class EqualNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if(num1==num2)
		{
			if (num1==num3)
				System.out.println("All numbers are equal");
			else
				System.out.println("only Number1 and number2 are equal");
		}
		else if(num2==num3)
		{
			System.out.println("Number2 and Number 3 are equal");
		}
		else if(num1==num3)
		{
			System.out.println("Number1 and number 3 are equal");
		}
		else
		{
			System.out.println("Number is not equal");
		}

	}

}
