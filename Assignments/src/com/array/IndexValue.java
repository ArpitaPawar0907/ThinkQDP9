package com.array;

import java.util.Arrays;

public class IndexValue {

	public static void checkindex(int a[],int n)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println(n+" number found at "+(i+1));
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {4,6,7,8,9,10};
		
	
		System.out.println(Arrays.toString(arr));

		checkindex(arr, 6);

	}

}
