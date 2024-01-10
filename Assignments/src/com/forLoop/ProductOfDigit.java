package com.forLoop;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
	   int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Digits:"+count);
		

	}

}
