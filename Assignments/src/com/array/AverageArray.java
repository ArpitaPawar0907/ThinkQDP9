package com.array;

import java.util.Arrays;

public class AverageArray {

	public static int average(int a[])
	{
		int sum=0;
		int avg;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		avg=sum/a.length;
		
		return avg;
	}
	
	public static double average(double a[])
	{
		double sum=0,avg;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			
			
		}
		
		avg=sum/a.length;
		
		return avg;
	}
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5,6};
		double arr2[]= {6.0,3.4,6.4,1.2,4.0};
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("Average of int array :"+(average(arr1)));
		System.out.println("--------------------------------");
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("Average of double array :"+(average(arr2)));
		
		

	}

}
