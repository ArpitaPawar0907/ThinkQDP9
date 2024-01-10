package com.forLoop;

public class SumOfHundred {
	public static void itemSum()
	{
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum+=i;
		}
		
		System.out.println("Total of hundred items : "+sum);
	}
	public static void main(String[] args) {
		itemSum();
	}

}
