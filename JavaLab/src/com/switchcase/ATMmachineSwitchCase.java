package com.switchcase;

import java.util.Scanner;

public class ATMmachineSwitchCase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double avlBalance=10000;
		double amt;
		System.out.println("1.Deposite");
		System.out.println("2.Withdraw");
		System.out.println("3.View Balance");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			 System.out.println("Enter amount to be deposited");
			 amt=sc.nextDouble();
			 avlBalance=avlBalance+amt;
			 System.out.println("Total amount :"+avlBalance);
			 break;
		case 2:
			 System.out.println("Enter amount to be withdraw");
			  amt=sc.nextDouble();
			      avlBalance=avlBalance-amt;
			     System.out.println("Total amount :"+avlBalance);
			 break;
		case 3:
			System.out.println("Balance is"+avlBalance);
			break;
			
		default:
			   System.out.println("Invalid option");
				
		}
		
		

	}

}
