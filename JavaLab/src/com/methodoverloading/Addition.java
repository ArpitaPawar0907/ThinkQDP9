package com.methodoverloading;

import java.util.Scanner;

public class Addition {
	
	void add(int num1,int num2)
	{
		System.out.println("Addition (int)"+(num1+num2));
	}
	void add(float num1,float num2)
	{
		System.out.println("Addition (float)"+(num1+num2));
	}
	void add(float num1,int num2)
	{
		System.out.println("Additon (float,int)"+(num1+num2));
	}
	void add(String s1,String s2)
	{
		System.out.println("Addition(String)"+(s1+s2));
	}
	

	public static void main(String[] args) {
		
		Addition a1=new Addition();
		
		Scanner sc=new Scanner(System.in);
		
		a1.add(10, 20);
		a1.add(12f, 23f);
		a1.add(12f, 34);
		a1.add("ABC", "DEF");
		System.out.println("-------------------------");
		System.out.println("Enter  num1");
		int n1=sc.nextInt();
		System.out.println("Enter num2");
		int n2=sc.nextInt();
		a1.add(n1, n2);
		
		
	}
}
