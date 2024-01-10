package com.foreachloop;

import java.util.Arrays;

public class CommanElementForEach {

	public static void commanElement(int a1[],int a2[])
	{
		for(int i:a1)
		{
			int count=0;
			for(int j:a2)
			{
				if(i==j)
				{
					count++;
				}
			}
			if(count>0)
				System.out.println(i);
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
