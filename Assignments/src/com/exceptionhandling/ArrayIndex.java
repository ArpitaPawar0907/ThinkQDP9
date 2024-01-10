package com.exceptionhandling;
/*
 * 1. WAP which throws ArrayIndexOutBoundsException. In the console, observe the stack trace and the 
line number from where the Exception is thrown
 */
public class ArrayIndex {

	public static void checkException(int arr[])
	{
		for(int i=0;i<=arr.length;i++)
		{
				System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
	
		int arr[]= {0,1,2,3};
		checkException(arr);
       
	}

}
