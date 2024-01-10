package com.forLoop;

public class Pattern10 {
	public static void pattern()
	{
		for(int i=10;i>=1;i--)
	{
		for(int sp=10;sp>=i;sp--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
		for(int i=1;i<=10;i++)
		{
			for(int sp=1;sp<=10-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
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
