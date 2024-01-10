package com.forLoop;

public class Pattern17 {
	public static void pattern()
	{
		
		for(int i=1;i<=5;i++)
	{
			char ch='A';
		for(int sp=1;sp<=5-i;sp++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++)
		{
			System.out.print(ch);
			ch++;
		}
		System.out.println();
	}
		}
		
		public static void main(String[] args) {
			
			
	      pattern();
		}

}
