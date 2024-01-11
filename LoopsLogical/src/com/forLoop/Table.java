package com.forLoop;

import java.util.Scanner;

public class Table {
	public static void multi(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+i*num);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
    multi(sc.nextInt());
    
	}

}
