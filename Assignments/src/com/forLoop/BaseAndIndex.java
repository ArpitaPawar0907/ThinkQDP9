package com.forLoop;

import java.util.Scanner;

public class BaseAndIndex {

	public static void main(String[] args) {
	
		int power=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		int base=sc.nextInt();
		System.out.println("Enter index");
		int index=sc.nextInt();
		for(int i=1;i<=index;i++)
		{
			power=power*base;
		}
		System.out.println(" Power is"+power);

	}

}
