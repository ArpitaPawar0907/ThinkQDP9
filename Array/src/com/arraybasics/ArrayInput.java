package com.arraybasics;

import java.util.*;

public class ArrayInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=sc.nextInt();
		System.out.println("Enter elements");
		int arr[]=new int[size];
		 
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
        System.out.println(Arrays.toString(arr));
        sc.close();
	}

}
