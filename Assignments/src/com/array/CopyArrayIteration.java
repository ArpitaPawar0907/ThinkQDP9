package com.array;

import java.util.Arrays;

public class CopyArrayIteration {

	public static void copyArray(int a[])
	{
		int size=a.length;
		int a2[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a2[i]=a[i];
		}
		System.out.println("Copied array:");
		System.out.println(Arrays.toString(a2));
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));

		copyArray(arr);
	}

}
