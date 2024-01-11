package com.switchcase;

import java.util.Scanner;

public class GenderSwitch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Gender");
		char gen=sc.next().charAt(0);
		
		switch(gen)
		{
		case 'F':
		case 'f':
			    System.out.println("Female");
			    break;
		case 'M':
		case 'm':
			    System.out.println("Male");
			    break;
		default:
			    System.out.println("Invalid choice");
 		}

	}

}
