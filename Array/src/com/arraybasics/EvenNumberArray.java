package com.arraybasics;

import java.util.Scanner;

public class EvenNumberArray {

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
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Sum of even:"+findSumOfEven(arr));
 sc.close();
	}

}
