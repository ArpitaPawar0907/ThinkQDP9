package com.array;

import java.util.Scanner;

public class SpecificValue {

//	public static boolean specificVal(int a[],int num)
//	{
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]==num)
//				return true;
//			else
//				return false;		
//		}
//		return false;
//	}
//
	
	public static boolean specificVal(int a[],int num)
	{
		for (int element : a) {
			if(element==num)
				return true;
			else
				return false;		
		}
		return false;
	}
	public static void main(String[] args) {
	
		int arr[]= {1,2,4,6,5,7,9};
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		specificVal(arr, n);
		
		
		sc.close();

	}

}
