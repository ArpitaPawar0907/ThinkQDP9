package com.arrayassignment1;

import java.util.Arrays;

public class ReplaceZerobyOne {
	
	public static void replaceZero(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
		
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {26, 0, 67, 45, 0, 78,54, 34, 10, 0, 34};
        System.out.println(Arrays.toString(arr));		
        replaceZero(arr);
        System.out.println(Arrays.toString(arr));
	}

}
