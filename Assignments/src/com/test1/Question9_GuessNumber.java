package com.test1;

import java.util.Scanner;

public class Question9_GuessNumber {

	public static void guess(int number)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("You have 5 chance");
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter the number");
			int num=sc.nextInt();
			if(num==number)
			{
				System.out.println("Number is correct");
				break;
			}
			else if(num>number)
			{
				System.out.println("Too high");
				continue;
			}
			else
			{
				System.out.println("too low");
				continue;
			}
			
		}


	}
		public static void main(String[] args) {
			
			guess(56);
			}


}
