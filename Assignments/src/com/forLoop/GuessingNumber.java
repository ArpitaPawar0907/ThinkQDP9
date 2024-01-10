package com.forLoop;

import java.util.Scanner;


public class GuessingNumber {
	public static void guess()
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=9;i++)
		{
			int key=4;
			System.out.println("Enter one digit the number");
			int num=sc.nextInt();
			if(num==key)
			{
				System.out.println("Number is correct");
				System.out.println("you took "+i+" chances");
				break;
			}
			else if(num>key)
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
			
			guess();
			}

}