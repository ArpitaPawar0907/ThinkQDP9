package com.arraybasics;

import java.util.Scanner;

public class SearchElement {
	public static boolean searchNumber(int a[],int n)
	{
		boolean status=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				status=true;
				break;
			}
			else
			{
				status=false;
			}
			
			
		}
		return status;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		
		System.out.println("Enter elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
	 	}
		System.out.println("Enter number to be search");
		int num=sc.nextInt();
		
		if(searchNumber(arr, num))
		{
			System.out.println("number is present");
		}
		else
		{
			System.out.println("Number is not present");
		}
		
		sc.close();

	}

}
