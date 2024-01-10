package com.forLoop;

public class DownwordPyramid {
	public static void pattern()
	{
		for(int i=5-1;i>=1;i--)
	{
		for(int sp=5-1;sp>=i;sp--)
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
