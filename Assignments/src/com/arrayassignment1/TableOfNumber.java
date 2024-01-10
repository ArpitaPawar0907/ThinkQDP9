package com.arrayassignment1;

import java.util.Arrays;
import java.util.Scanner;

public class TableOfNumber {

	public static void calTable(int num)
	{
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=num*(i+1);
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		calTable(n);
     sc.close();
	}

}
