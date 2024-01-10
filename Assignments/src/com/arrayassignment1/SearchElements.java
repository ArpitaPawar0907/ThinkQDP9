package com.arrayassignment1;

import java.util.Arrays;

public class SearchElements {

	public static void searchNumbers(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==65||a[i]==67)
			{
				System.out.println(a[i]+" present in array");
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {1,34,56,65,78,87,76,67};
		System.out.println(Arrays.toString(arr));
		searchNumbers(arr);

	}

}
