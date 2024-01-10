package com.conditionalStatement;

import java.util.Scanner;

public class FiveElevenDivisible {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num%5==0)
		{
			System.out.println(num +" is divible by 5");
		
		}
		else if(num%11==0)
		     {
			System.out.println(num +" is divible by 11");
		     }
		     else
		     {
		    	 System.out.println(num +" not divisible by 5 or 11");
		     }
		sc.close();
	}

}
