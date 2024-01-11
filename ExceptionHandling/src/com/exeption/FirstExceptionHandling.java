package com.exeption;

public class FirstExceptionHandling {
	
	public static void main(String[] args) {
		
		int x=10;
		int y=10;
		int result;
		try
		{
		 result=(x+y)/(x-y);
		System.out.println(result);
		}
		catch (Exception e) {
	         System.out.println(e);
		}
		result=(2*x)+(2*y);
		System.out.println(result);
	}

}
