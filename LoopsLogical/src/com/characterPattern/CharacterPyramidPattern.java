package com.characterPattern;

public class CharacterPyramidPattern {

	public static void characterPattern()
	{
	

		for(int i=1;i<=3;i++)
		{
			//String ch="ab";
			for(int sp=1;sp<=3-i;sp++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("ab");
				
			}
			
			System.out.println();
		}
	
	}
	public static void main(String[] args) {
		characterPattern();
	}
}
