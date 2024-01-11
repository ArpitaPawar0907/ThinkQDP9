package com.arraybasics;

import java.util.Arrays;

public class NegativeNumber {

	public static void checkNegative(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
				ar[i]=0;
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {1,-2,4,-6,-1,7};
        System.out.println(Arrays.toString(arr));
        checkNegative(arr);
        System.out.println(Arrays.toString(arr));
	}

}
