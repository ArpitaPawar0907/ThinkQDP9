package com.oopsmehods;

import java.util.Scanner;

public class Cube {
     
	public static void calCube(int l)
	{
		int cube;
		cube=l*l*l;
		System.out.println("cube"+cube);
	}
	public static int cal(int l)
	{
		int cube;
		cube=l*l*l;
		
		return cube;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int num=sc.nextInt();
		calCube(num);
		System.out.println("With return type"+cal(num));

	}

}
