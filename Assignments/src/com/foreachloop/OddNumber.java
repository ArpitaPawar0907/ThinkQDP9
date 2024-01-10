package com.foreachloop;

import java.util.Arrays;

public class OddNumber {
	public static void findOdd(int a[]) 
	{
		
		for(int i:a)
		{
			if(i%2!=0)
			{
			System.out.println(i);
			}
		}
	
	}

	public static void main(String[] args) {
	
		int arr[]= {4,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
	  findOdd(arr);
	

	}


}
