package com.forLoop;

public class FactorialNumber {

	public static long calculateFact(int num)
	{
		long fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
		System.out.println("--------------------");
		long fact1=1;
		for(int i=num;i>1;i--)
		{
			fact1=fact1*i;
			System.out.println(fact1);
		}
		System.out.println("---------------------");
		return fact;
	}
	public static void main(String[] args) {
		
		System.out.println(calculateFact(5));

	}

}
