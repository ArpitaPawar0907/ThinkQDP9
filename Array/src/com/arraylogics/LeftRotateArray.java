package com.arraylogics;

import java.util.Arrays;

public class LeftRotateArray {

	//output  345612
	public static void leftRotate(int a[])
	{
		int first;
		first=a[a.length-1];
		for(int i=1;i<a.length-1;i++)
		{
			for(int j=1;i<a.length-1;j++)
			{
			a[i]=a[j];
			}
		}
		a[0]=first;
		
	}
	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		leftRotate(arr);
		System.out.println(Arrays.toString(arr));

	}

}
