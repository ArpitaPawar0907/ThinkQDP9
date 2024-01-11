package com.arraybasics;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

	public static void sortAr(int ar[])
	{
		int temp;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
	
		//int arr[]= {2,3,6,1,4,8,5};
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter elements of array");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
        System.out.println(Arrays.toString(arr));
	
        System.out.println("After sorting:");
	      sortAr(arr);
	      System.out.println(Arrays.toString(arr));
	sc.close();
	}

}
