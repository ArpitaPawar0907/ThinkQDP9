package com.exeption;

import java.util.Scanner;

public class MultiCatchOr {

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
	// we cannot or Exception /Runtime exception 
	catch(ArithmeticException  | ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	
	catch(Exception e)
	{
		System.out.println("Other :"+e);
	}
	
   sc.close();
	}

}
