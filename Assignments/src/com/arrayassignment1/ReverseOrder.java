package com.arrayassignment1;

import java.util.Arrays;

public class ReverseOrder {

	public static void reverseOrder(int a[])
	{
	
		int rev[]=new int[a.length];
		int size=a.length;
		for(int i=0;i<a.length;i++)
		{
			//for(int j=a.length;j>=0;j--)
			size--;
		  rev[size]=a[i];
			
		}
		System.out.println("Reverse array:");
		System.out.println(Arrays.toString(rev));
	}
	public static void logic2(int a[])
	{
	int index=0;
	int rev[]=new int[a.length];
	for(int i=a.length;i>=0;i--)
	{
		if(i<rev.length)
		{
			rev[index]=a[i];
			index++;
		}
	}
	System.out.println("Reverse array:");
	System.out.println(Arrays.toString(rev));
	}
	public static void main(String[] args) {
		
		int arr[]= {3,90,45,29,37,78};
		System.out.println(Arrays.toString(arr));
		reverseOrder(arr);
		System.out.println("------------------------");
		logic2(arr);

	}

}
