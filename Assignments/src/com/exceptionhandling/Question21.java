package com.exceptionhandling;

import java.util.Scanner;

public class Question21 {

	public static void multipleCatch(int n)
	{
		try
		{
			System.out.println("Result :"+(100/n));
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		multipleCatch(num);
		sc.close();

	}

}
