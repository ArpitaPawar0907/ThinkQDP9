package com.forLoop;

public class Pattern12 {
	public static void pattern()
	{ int a=1;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
	}
		
		public static void main(String[] args) {
			
			
	      pattern();
		}

}
