package com.forLoop;

import java.util.Scanner;

public class AdditionalSeriesOfNumber {
	public static void seriesOfNumber(int n)
	{
		for(int i=10;i<=n;i+=10)
		{
			System.out.println(i+", ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number upto serise ");
		int num=sc.nextInt();
		seriesOfNumber(num);
		
		sc.close();
		
	}

}
