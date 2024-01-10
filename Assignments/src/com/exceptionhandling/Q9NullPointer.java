package com.exceptionhandling;
/*
 * 9. WAP to show 3 different scenario in which null pointer exceptions generated, and handle that 
exception
 */
public class Q9NullPointer {

	public static void showNullPointer1()
	{
		String s=null;
		try
		{
			
			System.out.println(s.length());
		}catch (NullPointerException e) {
			System.out.println("String :"+e);
		}
		
		
	}
	public static void showNullPointer2()
	{
		try {
		int arr[]=null;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		}
		catch (NullPointerException e) {
			
			System.out.println("Arrays :"+e);
		}
		
	}
	public static void showNullPointer3()
	{
	
		try
		{
			throw null;
		}
		catch (NullPointerException e) {
	
			System.out.println("Throw null"+e);
		}
	}
	public static void main(String[] args) {
		

		showNullPointer1();
		showNullPointer2();
		showNullPointer3();
	}

}
