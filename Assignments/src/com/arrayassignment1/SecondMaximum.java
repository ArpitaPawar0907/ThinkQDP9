package com.arrayassignment1;

import java.util.Arrays;

public class SecondMaximum {


	public static void maximumNumber(int a[])
	{
	     int maxNum=a[0];
	     int secondMax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>maxNum)
			{
				secondMax=maxNum;
				maxNum=a[i];
				
			}
			else if(secondMax<a[i] && a[i]!=maxNum)
			{
				secondMax=a[i];
			}
		}
		System.out.println("Maximum number:"+maxNum);
		System.out.println("Second max:"+secondMax);
	}
	public static void main(String[] args) {
		
		int arr[]= {90,80,60};
		System.out.println(Arrays.toString(arr));
		maximumNumber(arr);
		

	}

}
