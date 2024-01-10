package com.exceptionhandling;

import java.util.Scanner;

public class Q10throwAndFinally{

	static Scanner sc=new Scanner(System.in);
	public static void checkException()
	{
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter balace");
		double bal=sc.nextDouble();
		
		try
		{
			double si=bal/0;
			throw new ArithmeticException();
		}
		catch (ArithmeticException e) {
		
			System.out.println(e);
		}
		finally {
			
			System.out.println("Employee name"+name+" salary:"+bal);
		}
	}
	public static void main(String[] args) {
		
		checkException();

	}

}
