package com.patterns;

public class Pattern123 {

	public static void pattern()
	{
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern();

	}

}
