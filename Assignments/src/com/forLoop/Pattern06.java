package com.forLoop;

public class Pattern06 {
	public static void pattern()
	{
		for(int i=1;i<=8;i++)
		{
			for(int sp=1;sp<=8-i;sp++)
			{
				System.out.print(" ");
			}
		
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
		public static void main(String[] args) {
			
			
	      pattern();
		}


}
