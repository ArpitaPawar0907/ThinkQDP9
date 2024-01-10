package com.switchAssignment;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1=sc.nextInt();
		System.out.println("Enter number 2");
		int num2=sc.nextInt();
		System.out.println("1.Addition 2.Subdration 3.Division 4.Multiplication");
		System.out.println("Enter Your Choice");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		
		case 1:
			    System.out.println("Addition is"+(num1+num2));			   
			    break;
		case 2: 
			    System.out.println("Subtraction is "+(num1-num2));
			    break;
		case 3: 
			    System.out.println("Division is "+(num1/num2));
		        break;
		case 4:
			    System.out.println("Multiplication is"+(num1*num2));
			    break;
		default:
			    System.out.println("Invalid choice");
		
		}
		
	}

}
