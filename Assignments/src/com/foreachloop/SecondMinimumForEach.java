package com.foreachloop;

import java.util.Arrays;

public class SecondMinimumForEach {

	public static void minimum(int a[])
	{
		int minVal=0;
		int secondMin=a[0];
		for(int i:a)
		{
			if(i<minVal)
			{
				secondMin=minVal;
				minVal=i;
						
			
			}
			else if(secondMin>i && i!=minVal)
			{
				secondMin=i;
			}
	    }
		System.out.println("Minimum: "+minVal);
		System.out.println("Second minimum: "+secondMin);

	}
	public static void main(String[] args) {
		
		int arr[]= {-20,0,-25,15,19,37,23};

		
		System.out.println(Arrays.toString(arr));
		minimum(arr);
	    // minimum(arr1);	
	}

}
