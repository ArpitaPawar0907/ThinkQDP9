package com.exeption;

public class NestedTry {
	public static void main(String[] args) {
		
		int arr[]= {12,0,8};
		
		try
		{
			for (int i = 0; i < arr.length; i++) 
			{
				   System.out.println("Array :"+(100/arr[i]));	
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("--------------------------------------------");
		try
		{
			for(int i=0;i<arr.length;i++)
			{
				try
				{
				System.out.println("Value :"+100/arr[i]);
				}
				catch(ArithmeticException e)
				{
					System.out.println(e);
				}
			}
		}
		catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
