package com.foreachloop;

import java.util.Arrays;

public class AlternateNumberForEach {
	
	public static void alternate(int a[]) 
	{
		
		for(int i:a)
		{
			System.out.print(i+" ");
			i++;
		}
	
	}


	public static void main(String[] args) {
		
		int arr[]= {4,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
		alternate(arr);

	}

}
