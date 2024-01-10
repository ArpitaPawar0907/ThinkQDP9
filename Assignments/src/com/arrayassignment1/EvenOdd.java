package com.arrayassignment1;

import java.util.Arrays;

public class EvenOdd {
	
	public static void checkEvenOdd(int a[])
	{
		int pos=0;
		int temp[]=a;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				a[pos]=a[i];
				pos++;
			}
		}
		for(int i=pos;i<a.length;i++)
		{
			if(temp[i]%2!=0)
			{
				a[pos]=temp[i];
				pos++;
			}
		}
	}

	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5,6,7,8};
		 System.out.println(Arrays.toString(arr));
		 checkEvenOdd(arr);
		 System.out.println(Arrays.toString(arr));


	}

}
