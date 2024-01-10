package com.forLoop;

import java.util.Scanner;

public class AdditionalSeriesQuestion2 {
	public static void series()
	{
	
		int s=1;
		for(int i=1;i<=10;i++)
		{
			System.out.print(s+" , ");
			s=s+i;
			
		}
	}
	public static void main(String[] args) {
		
		series();
	}

}
