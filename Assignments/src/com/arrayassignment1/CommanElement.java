package com.arrayassignment1;

import java.util.Arrays;

public class CommanElement {

	public static void commanElement(int a1[],int a2[])
	{
		for(int i=0;i<a1.length;i++)
		{
			int count=0;
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					count++;
				}
			}
			if(count>0)
				System.out.println(a1[i]);
		}
	}
	public static void main(String[] args) {
		
		int arr1[] = {12, 23, 34, 67 ,78, 91, 56};
	   int arr2[] = {39, 25, 15, 23, 55, 91,66,22}; 
		      
	   System.out.println(Arrays.toString(arr1));
	   System.out.println(Arrays.toString(arr2));
	   commanElement(arr1, arr2);

	}

}
