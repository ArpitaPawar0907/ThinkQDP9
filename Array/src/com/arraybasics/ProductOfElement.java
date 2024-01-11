package com.arraybasics;

import java.util.Scanner;

public class ProductOfElement {

	public static long product(int a[])
	{
		long result=1;
		for(int i=0;i<a.length;i++)
		{
			result=result*a[i];
		}
		return result;
	}
	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter number");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
	    System.out.println("Product of numbers:"+product(arr));
		
    sc.close();
	}

}
