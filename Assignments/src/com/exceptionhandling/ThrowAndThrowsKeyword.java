package com.exceptionhandling;
/*
 * 17. WAP to show throw and throws keyword.
 */
public class ThrowAndThrowsKeyword {

	public static void checkException() throws NullPointerException
	{
		try
		{
			
			throw new NullPointerException();
		}catch (Exception e) {
			
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		checkException();

	}

}
