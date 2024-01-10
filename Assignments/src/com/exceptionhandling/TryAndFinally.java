package com.exceptionhandling;
/*
 * . WAP where only try and finally is used
 */
public class TryAndFinally {

	public static void tryAndFinallyBlock(int arr[])
	{
		
		try {
			for(int i=0;i<=arr.length;i++)
				System.out.println(arr[i]);
				
		}
		finally {
			System.out.println("Finally block");
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		tryAndFinallyBlock(arr);

	}

}
