package com.arrayassignment1;

import java.util.Arrays;

// [2, 4, 9, 0], so your output array must be [9, 0,2,4]

public class SwapArray {

	public static void swapArray(int a[])
	{
	    int temp;
		for(int i=0;i<a.length;i++)
		{
		   temp=a[i];
		   a[i]=a[i+2];
		}
		
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		int arr[]= {2,4,9,0};
		System.out.println(Arrays.toString(arr));
		swapArray(arr);
		

	}

}
