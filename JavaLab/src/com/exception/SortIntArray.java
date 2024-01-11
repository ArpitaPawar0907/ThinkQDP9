package com.exception;

import java.util.Arrays;

public class SortIntArray {
	
	
	public static void sortArray(int arr[])
	{
		int max=0;
		int a2[]=new int[arr.length];
		int len=arr.length/2;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];}
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--)
		{
			if(arr[i]%2==0)
			{
				a2[i]=arr[i];
			}
			else
				a2[j]=arr[i];
		}
		arr[len]=max;
		System.out.println(Arrays.toString(arr));	
		
	System.out.println(len);
	System.out.println(arr.length);
	}
	public static void main(String[] args) {
		
		int arr[]= {3,8,4,9,10,43,7,11,30};
		sortArray(arr);
	}

}
