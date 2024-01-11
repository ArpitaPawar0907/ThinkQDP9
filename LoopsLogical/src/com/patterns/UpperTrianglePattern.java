package com.patterns;

public class UpperTrianglePattern {
	public static void upperTriangle()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	
		upperTriangle();

	}

}
