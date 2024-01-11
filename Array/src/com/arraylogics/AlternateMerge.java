package com.arraylogics;

import java.util.Arrays;

public class AlternateMerge {
    //output arr=1,3,5,2,4,6
	public static void mergeArray(int a[])
	{
		int marr[]=new int[a.length];
		int pos=0;
		for(int i=0;i<a.length;i+=2)
		{
			marr[pos]=a[i];
			pos++;
		}
		for(int i=1;i<a.length;i+=2)
		{
			marr[pos]=a[i];
			pos++;
		}
		System.out.println(Arrays.toString(marr));
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6}; 
		System.out.println(Arrays.toString(arr));
		mergeArray(arr);

	}

}
