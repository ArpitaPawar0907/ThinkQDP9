package com.characterPattern;

public class CharacterPattern2 {
	public static void pattern()
	{
		
		for(int i='A';i<='D';i++)
		{
			for(int j='A';j<=i;j++)
			{
				System.out.print((char)j);
				
			}
		
			System.out.println();
		}
	}
		
	public static void pattern2()
	{
		

		for(int i='A';i<='D';i++)
		{
			for(int j='A';j<=i;j++)
			{
				System.out.print(j);
				
			}
		
			System.out.println();
		}
	}
		public static void main(String[] args) {
			
			
	      pattern();
	      System.out.println("-------------------------------------------");
	      pattern2();
		}


}
