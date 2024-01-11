package com.arraybasics;

import java.util.Arrays;

public class ShiftNegativeAtEnd {

	public static void shiftNegative(int a[])
	{
		int pos=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				a[pos]=a[i];
				pos++;
			}
		}
		
	}
	public static void main(String[] args) {
		
		int arr[]= {1,-2,4,-6,-1,7};
        System.out.println(Arrays.toString(arr));
        shiftNegative(arr);
        System.out.println(Arrays.toString(arr));
	
        
        

	}

}
