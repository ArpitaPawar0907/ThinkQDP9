package com.forLoop;

public class Pattern16 {

	public static void pattern()
	{
		
		for(int i='A';i<='J';i++)
		{
			for(int j='A';j<=i;j++)
			{
				System.out.print((char)j);
			}
			
			System.out.println();
		}
	}
		
		public static void main(String[] args) {
			
			
	      pattern();
		}


}
