package com.arraybasics;

import java.util.Arrays;

public class ArrayOddEven {

	public static int findSumOfEven(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			 sum=sum+a[i];
			}
		}
		return sum;
	}
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
	
		int arr[]= {4,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum of Odd number:"+findSumOfEven(arr));
		System.out.println("Sum of Odd number:"+findSumOfOdd(arr));

	}

}
