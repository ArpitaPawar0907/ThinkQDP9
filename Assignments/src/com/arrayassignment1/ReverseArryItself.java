package com.arrayassignment1;

import java.util.Arrays;

public class ReverseArryItself {

	public static void reverseItself(int a[])
	{
	
		
		for(int i=a.length-1;i>=0;i--)
		{
		System.out.print(a[i]+" ,");	
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {3,90,45,29,37,78};
		System.out.println(Arrays.toString(arr));
		reverseItself(arr);


	}

}
