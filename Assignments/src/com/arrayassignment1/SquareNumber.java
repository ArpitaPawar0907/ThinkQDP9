package com.arrayassignment1;

import java.util.Arrays;

public class SquareNumber {
	
	public static void findsquare(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(Math.sqrt(a[i])>0)
				System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		
	   int arr[] = {23, 43, 25, 49, 12, 9, 78, 66, 39, 0};
         
	   System.out.println(Arrays.toString(arr));
	   findsquare(arr);
	}

}
