package com.exceptionhandling;
/*
 *  WAP to show unchecked exception
 */
public class UncheckedException {

	public static void showUnchecked()
	{
		try
		{
	
		  System.out.println(" Answer:"+(20/0));
			
		}catch ( ArithmeticException e) {
	
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
      showUnchecked();

	}

}
