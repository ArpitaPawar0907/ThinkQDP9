package com.exceptionhandling;

import java.util.Scanner;

public class MainMethodException {

	public static void main(String[] args) throws RuntimeException {
		
		
		try
		{
		 
			throw new RuntimeException("Main method");
		}
		catch (Exception e) {
		System.out.println(e);
		}
		

	}

}
