package com.forLoop;

public class Pattern02 {
	public static void pattern()
	{
		for(int i=1;i<=6;i++)
		{
			for(int sp=1;sp<=6-i;sp++)
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
