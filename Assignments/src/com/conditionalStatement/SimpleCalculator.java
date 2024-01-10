package com.conditionalStatement;

import java.util.Scanner;

public class SimpleCalculator {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1=sc.nextInt();
		System.out.println("Enter number 2");
		int num2=sc.nextInt();
		System.out.println("Enter operation");
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
		int op=sc.nextInt();
		if(op==1)
			System.out.println("Addition :"+(num1+num2));
		else if(op==2)
			   System.out.println("subtraction :"+(num1-num2));
		     else if(op==3)
			        System.out.println("Multiplcation :"+(num1*num2));
		          else if(op==4)
			           System.out.println("Division :"+(num1/num2));
		               else
			             System.out.println("Invalid");
		
		sc.close();
	}
}
