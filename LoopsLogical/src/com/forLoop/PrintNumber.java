package com.forLoop;

public class PrintNumber {

	public static void printNum()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("------------------------");
		int j=1;
		for(;j<=10;)
		{
			System.out.println(j);
			j++;
			
		}
	}
	public static void main(String[] args) {
		
      printNum();
	}

}
