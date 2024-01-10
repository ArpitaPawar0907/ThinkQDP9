package com.array;

import java.util.Arrays;

public class ReverseArray {

	public static void reverse(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+"  ");
		}
	}
	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		reverse(arr);

	}

}
