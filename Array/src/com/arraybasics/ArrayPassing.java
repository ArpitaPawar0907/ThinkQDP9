package com.arraybasics;

import java.util.Arrays;

public class ArrayPassing {

	public static void squareElement(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=ar[i]*ar[i];
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5};
		System.out.println(Arrays.toString(arr));
		
		squareElement(arr);
         System.out.println(Arrays.toString(arr));
	}

}
