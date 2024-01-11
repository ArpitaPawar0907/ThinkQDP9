package com.twodarray;

import java.util.Scanner;

public class TwoDiamentionalArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[2][3];
		System.out.println("Enter elements");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("----------------------------");
		for(int i=0;i<2;i++)
		{
			for(int x:a[i])
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
       System.out.println("------------------------------");
       
       int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
       
       for(int i=0;i<arr.length;i++)
		{
			for(int x:arr[i])
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}
