package com.arrayassignment1;

import java.util.Arrays;

public class MissingNumber {

	public static void checkMissing(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=(i+1))
			{
				System.out.println((i+1)+" missing");
				break;
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,6,7,8};
		
		System.out.println(Arrays.toString(arr));
		checkMissing(arr);

	}

}
