package com.arraylogics;

import java.util.Arrays;

public class ZeroAtEndArray {

	public static void shiftZero(int a[])
	{
		int pos=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[pos]=a[i];
				pos++;
			}
		}
		while(pos<a.length)
		{
			a[pos]=0;
			pos++;
		}
	}
	public static void main(String[] args) {
	
		int arr[]= {1,0,2,0,5,0,7,4};

		 System.out.println(Arrays.toString(arr));
		 shiftZero(arr);
		 System.out.println("---After zero--------");
		 System.out.println(Arrays.toString(arr));
	}

}
