package com.twodarray;

import java.util.Scanner;

public class Question1 {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][4];
		System.out.println("Enter elements");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("----------------------------");
		for(int i=0;i<3;i++)
		{
			for(int x:a[i])
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}

}
}