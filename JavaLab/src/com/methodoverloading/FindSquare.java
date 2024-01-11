package com.methodoverloading;

import java.util.Scanner;

public class FindSquare {
	
	void square(int num)
	{
		System.out.println("Square(int)"+(num*num));
	}
	void square(float num)
	{
		System.out.println("Square(float)"+(num*num));
	}
	void square(double num)
	{
		System.out.println("Square(double)"+(num*num));
	}
	
	public static void main(String[] args) {
		
		FindSquare f1=new FindSquare();
		Scanner sc=new Scanner(System.in);
		f1.square(2);
		f1.square(3f);
		f1.square(34.9);
		
		System.out.println("--------------------------------------");
		
		System.out.println("Enter number");
		int n=sc.nextInt();
		f1.square(n);
		
		
		
		
		
		
		
		
	}

}
