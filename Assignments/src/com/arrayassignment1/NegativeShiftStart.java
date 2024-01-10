package com.arrayassignment1;

import java.util.Arrays;

public class NegativeShiftStart {

	public static void shiftNegative(int a[])
	{
		int pos=a.length-1;
		//int temp;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				a[pos]=a[i];
				pos--;
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {2,4,-5,-7,6,-8,9,-6,4};
		System.out.println(Arrays.toString(arr));
		
		shiftNegative(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
