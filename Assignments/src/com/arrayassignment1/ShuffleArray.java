package com.arrayassignment1;

import java.util.Arrays;

public class ShuffleArray {

	public static void shuffleArray(int a[])
	{
		int first=a[0];
		for (int i = 0; i < a.length-1; i++) {
			a[i]=a[i+1];
					
		}
		a[a.length-1]=first;
	}
	public static void main(String[] args) {
	
		int arr[]= {5,6,23,67,49,2};
		System.out.println(Arrays.toString(arr));
		shuffleArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}
