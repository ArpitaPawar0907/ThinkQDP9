package com.forLoop;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
	   int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		while(num>0)
		{
		
		count++;
			num=num/10;
		
		}
		System.out.println("digit:"+count);
		

	}

}
