package com.arraybasics;

import java.util.Scanner;

public class OddNumber {
	public static int findSumOfOdd(int a[]) 
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				sum=sum+a[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Sum of Odd number:"+findSumOfOdd(arr));
		
        sc.close();
	}

}
