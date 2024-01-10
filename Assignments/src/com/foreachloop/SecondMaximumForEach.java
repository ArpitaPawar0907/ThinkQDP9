package com.foreachloop;

import java.util.Arrays;

public class SecondMaximumForEach {


	public static void maximumNumber(int a[])
	{
	     int maxNum=a[0];
	     int secondMax=0;
		for(int x:a)
		{
			if(x>maxNum)
			{
				secondMax=maxNum;
				maxNum=x;
				
			}
			else if(secondMax<x && x!=maxNum)
			{
				secondMax=x;
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
