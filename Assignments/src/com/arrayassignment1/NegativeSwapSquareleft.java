package com.arrayassignment1;

import java.util.Arrays;

public class NegativeSwapSquareleft {

	public static void checkNegative(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
			}
		}
	}
	public static void main(String[] args) {
		

	int	arr[] = {12, 3, -19, 29, 5, -61, 44, 7, -9};
	
	System.out.println(Arrays.toString(arr));
	checkNegative(arr);
	System.out.println(Arrays.toString(arr));
	
	}

}
