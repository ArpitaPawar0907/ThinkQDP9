package com.patterns;

public class DiamondPattern {
    
	public static void diamondPattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int sp=1;sp<=5-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
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
		
		diamondPattern();

	}

}
