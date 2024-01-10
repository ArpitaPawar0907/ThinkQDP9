package com.foreachloop;

import java.util.Arrays;

public class SquareNumberForEach {
	
	public static void findsquare(int a[])
	{
		for(int i:a)
		{
			if(Math.sqrt(i)>0)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
	   int arr[] = {23, 43, 25, 49, 12, 9, 78, 66, 39, 0};
         
	   System.out.println(Arrays.toString(arr));
	   findsquare(arr);
	}

}
