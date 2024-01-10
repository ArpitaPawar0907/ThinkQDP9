package com.oopsmehods;

import java.util.Scanner;

public class Square {
     
	public static void calSquare(int l)
	{
		int square;
		square=l*l;
		System.out.println("Square"+square);
	}
	public static int cal(int l)
	{
		int square;
		square=l*l;
		
		return square;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int num=sc.nextInt();
		calSquare(num);
		System.out.println("With return type"+cal(num));

	}

}
