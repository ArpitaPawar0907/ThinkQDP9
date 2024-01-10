package com.test1;

import java.util.Scanner;

public class Question10_SimpleCalculator {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1=sc.nextInt();
		System.out.println("Enter number 2");
		int num2=sc.nextInt();
		System.out.println("1.Addition 2.Subdration 3.Division 4.Multiplication");
		System.out.println("Enter Your Choice");
		char op=sc.next().charAt(0);
		
		switch(op)
		{
		
		case '+':
			    System.out.println("Addition is"+(num1+num2));			   
			    break;
		case '-': 
			    System.out.println("Subtraction is "+(num1-num2));
			    break;
		case '/': 
			    System.out.println("Division is "+(num1/num2));
		        break;
		case '*':
			    System.out.println("Multiplication is"+(num1*num2));
			    break;
		default:
			    System.out.println("Invalid choice");
		
		}
		
	}


}
