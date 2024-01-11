package com.methodoverloading;

public class Pattern2 {

	public static void pattern(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int sp=1;sp<=row-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{  
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
		for(int i=1;i<=row;i++)
		{
			for(int sp=1;sp<=row-i;sp++)
			{
				System.out.print(" ");
			}
				for(int j=row;j>=i;j--)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
	
		pattern(5);

	}

}
