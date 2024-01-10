package com.forLoop;

import java.util.Scanner;

public class Pattern04 {
	public static void diamondPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int sp=1;sp<=n-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int sp=n-1;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int row=sc.nextInt();
		diamondPattern(row);

	}


}
