package com.exceptionhandling;

import java.util.Scanner;

/*
 *  WAP to check can we have an empty catch block?
 */
public class EmptyCatchBlock {

	static Scanner sc=new Scanner(System.in);
	public static void checkCatchBlock()
	{
		try {
		System.out.println("Enter the name");
		String s=sc.next();
		
		
		}
		catch (Exception e) {
		
		}
		
	}
	public static void main(String[] args) {
		
		checkCatchBlock();

	}

}
