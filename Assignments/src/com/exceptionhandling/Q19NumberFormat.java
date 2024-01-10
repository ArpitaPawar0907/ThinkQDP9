package com.exceptionhandling;

public class Q19NumberFormat {

	public static void checkNumberFormat()
	{
		try {
		int a = Integer.parseInt("1a");
		}
		catch (NumberFormatException e) {
			
			System.out.println(e);
		}
	}
	public static void main(String args[]) {
	
	checkNumberFormat();

	}

}
