package com.forLoop;

import java.util.Scanner;

public class AdditionalSeriesQuestion3 {
	public static void series()
	{
		
		int s=0,count=1;
		for(int i=1;i<=10;i++)
		{
			s=s+count;
			System.out.print(s+" , ");
			count+=2;
			
			
		}
	}
	public static void main(String[] args) {
		
		series();
	}

}
