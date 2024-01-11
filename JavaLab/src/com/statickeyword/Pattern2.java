package com.statickeyword;

public class Pattern2 {

	public static void pattern2()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2!=0) {
					
				System.out.print("1");
				}
				else
				{
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
          pattern2();
	}

}
