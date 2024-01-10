package com.exceptionhandling;

import java.io.IOException;

/*
 * 4. WAP to show checked exception and use multiple catch block with universal Exception handler.
 */
public class MultiCatchChecked {

	public static void multipleCatch(int n)
	{
		try
		{
			System.out.println(" number "+n);
		 throw new IOException("Checked exception"); 
		}
		catch (IOException e) {
			System.out.println(e);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		int num=20;
		multipleCatch(num);

	}

}
