package com.exeption;

import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	try
	{
		int arr[]=new int[3];
		System.out.println("Enter elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i <= arr.length; i++) {
		   System.out.println("Array :"+(100/arr[i]));	
		}
		
	}
	catch(ArithmeticException e)
	{
		System.out.println(e+" cannot divide by 0");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e+"-> array iterates over greater index");
	}
	catch(Exception e)
	{
		System.out.println("Other :"+e);
	}
	//we cannot write Exception as first catch block beacause other blocks will become unreachable

	sc.close();
	}
	
	

}
