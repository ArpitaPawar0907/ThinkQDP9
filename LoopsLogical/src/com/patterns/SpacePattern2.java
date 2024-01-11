package com.patterns;

import java.util.Scanner;

public class SpacePattern2 {

	public static void spacePattern2()
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int sp=1;sp<=5-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		
			
			System.out.println("");
		}
	}
	public static void userPattern()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		//int rows=
	}

	public static void main(String[] args) {
		
		spacePattern2();

	}

}
