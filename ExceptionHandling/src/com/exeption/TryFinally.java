package com.exeption;

public class TryFinally {

	public static void main(String[] args) {
		
		try
		{
		int res=20/0;	
		}
		finally {
			System.out.println("Rest of code");
		}
	}
}
