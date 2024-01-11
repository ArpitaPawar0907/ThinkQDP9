package com.switchcase;

import java.util.Scanner;

public class SizeSwitch {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		
		int size=sc.nextInt();
		switch(size)
		{
		case 30:
		case 31:
		case 32:
		case 33:
		case 34:
			    System.out.println("small");
			    break;
		case 35:
		case 36:
		case 37:
		case 38:
			System.out.println("Medium");
			break;
		
		case 39:
		case 40:
			   System.out.println("Large");
			   break;
		case 41:
		case 42:
		case 43:
		case 44:
			System.out.println("Extra Large");
			break;
		default:
			System.out.println("Sorry Don't have size");
			break;
			
		}

	}

}
