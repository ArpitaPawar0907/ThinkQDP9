package com.forLoop;

public class Pattern07 {
	public static void pyramid()
	{
		
		for(int i=8;i>=1;i--)
		{
			for(int sp=8;sp>=i;sp--)
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
		pyramid();
	}

}
