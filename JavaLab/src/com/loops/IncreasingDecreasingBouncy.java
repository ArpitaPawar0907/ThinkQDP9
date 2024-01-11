package com.loops;

import java.util.Scanner;

public class IncreasingDecreasingBouncy {
	
	public static boolean decreasingNumber(int num)
	{	
		
		int rem;
		int temp=0;
		while(num!=0)
		{
			rem=num%10;
			if(temp<rem)
			{
				num=num/10;
				temp=rem;
			}
			else
			{
				break;
			}
		}
		if(num==0)
			return true;
		else
			return false;
	}
	
	public static boolean increasingNumber(int num)
	{
		int rem;
		int temp=10;
		while(num!=0)
		{
			rem=num%10;
			if(temp>rem)
			{
				num=num/10;
				temp=rem;
			}
			else
			{
				break;
			}
		}
		if(num==0)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if(increasingNumber(num))
			System.out.println("Increasing Number");
		else if(decreasingNumber(num))
			System.out.println("Decreasing number");
		else
			System.out.println("Bouncy Number");
		
	}

}