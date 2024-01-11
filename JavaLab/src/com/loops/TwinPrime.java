package com.loops;

import java.util.Scanner;

public class TwinPrime {
	public static boolean primeNumber(int num)
	{

		boolean status=false;
	if(num==1||num==0)
	{
		status=true;
	}
	else
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				status=true;
			}
		}
	}
	return status;
	}
	
     public static void twinPrime(int num1,int num2)
     {
    	 int num3;
    	 boolean status=false;
    	 
    	if((!primeNumber(num1))&&(!primeNumber(num2)))
    	{
    		num3=num1-num2;
    		status=primeNumber(num3);
    	}
    	else
    	{
    		System.out.println("Enter number is not prime number");
    	}
    	
    	if(!status)
    	{
    		System.out.println("Numbers are twin prime");
    	}
    	else
    	{
    		System.out.println("Number are not twin prime");
    	}
    	
     }
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=sc.nextInt();
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		
        twinPrime(num1, num2);
	}

}
