package com.abstractDemo;

public class Factorial {

	public static long factorial(int num)
	{
		long fact=1;
		while(num!=0)
		{
			fact=fact*num;
			num--;
		}
		return fact;
	}
	public static void main(String[] args) {
	
		for(int i=1;i<=10;i++)
		{
		System.out.println("factorial of "+i+" = "+factorial(i));
		}

	}

}
