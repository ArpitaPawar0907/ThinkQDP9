package com.dec28;

import java.util.Arrays;

public class RotedArray
{
	static void rotatedArrayRight(int arr[]) 
	{
		
        int lastElement = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) 
        {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastElement;
    }


	   public static void main(String []args)
	   {
	       int arr[] = {3,4,1,5,2};
		   
		   System.out.println(Arrays.toString(arr));
		   
		   rotatedArrayRight(arr);
		   System.out.println(Arrays.toString(arr));
		   
		   
	   } 
		   
	  }