package com.oopsmehods;

import java.util.Scanner;

public class ArithematicOperion {

	public static void add(int num1,int num2)
	{
		System.out.println("Addition"+num1+num2);
	}
	
	public static void sub(int num1,int num2)
	{
		System.out.println("Subtraction"+(num1-num2));
	}
	
	public static void multiplication(int num1,int num2)
	{
		System.out.println("Multiplication"+num1*num2);
	}
	
	public static void division(int num1,int num2)
	{
		System.out.println("Division"+num1/num2);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		int n1=sc.nextInt();
		System.out.println("Enter num2");
		int n2=sc.nextInt();
		
		add(n1, n2);
		sub(n1, n2);
		multiplication(n1, n2);
		division(n1, n2);

	}

}
