package com.exceptionhandling;
/*
 * 2. WAP to use catch / handle the ArrayIndexOutOfBoundsException exception.

 */
public class ArrayIndexTryCatch {

	public static void checkException(int arr[])
	{
		try {
		for(int i=0;i<=arr.length;i++)
		{
				System.out.println(arr[i]);
		}
		}catch (ArrayIndexOutOfBoundsException e) {
             
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
	

		int arr[]= {0,1,2,3};
		checkException(arr);
    

	}

}
