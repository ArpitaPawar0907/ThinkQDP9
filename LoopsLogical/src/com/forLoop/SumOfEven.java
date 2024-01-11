package com.forLoop;

import java.util.Scanner;

public class SumOfEven {
	public static int evenNumber(int num)
	{
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			{
			sum=sum+i;
			System.out.println(sum);
			}
		}
		System.out.println("------------------");
	return sum;
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int n=sc.nextInt();
		System.out.println(evenNumber(n));
		System.out.println(evenNumber(10));
		
	}

}
