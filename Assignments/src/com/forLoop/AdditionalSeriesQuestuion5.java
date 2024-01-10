package com.forLoop;

import java.util.Scanner;

public class AdditionalSeriesQuestuion5 {
	
	 public static void main(String args[])
	 {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number of terms: ");
	  int n = sc.nextInt();
	  int s = 0, c;                                         
	  for (c = 1; c <= n; c++)                          
	  {
	   s = s * 10 + 1;
	   System.out.print(s + " ");
	  }                                                          
	 
	}




}
