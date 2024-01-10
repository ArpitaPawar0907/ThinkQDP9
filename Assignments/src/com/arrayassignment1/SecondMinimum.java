package com.arrayassignment1;

import java.util.Arrays;

public class SecondMinimum {

	public static void minimum(int a[])
	{
		int minVal=0;
		int secondMin=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<minVal)
			{
				secondMin=minVal;
				minVal=a[i];
						
			
			}
			else if(secondMin>a[i] && a[i]!=minVal)
			{
				secondMin=a[i];
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
