package com.patterns;

import java.util.Scanner;

public class SpacePattern {
	public static void spacePattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int sp=1;sp<=4;sp++)
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
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int sp=1;sp<=rows-1;sp++)
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
	public static void main(String[] args) {
            		
                  spacePattern();
                  System.out.println("-------------------------");
                  userPattern();
                  System.out.println();
                 // spacePattern2();
	}

}
