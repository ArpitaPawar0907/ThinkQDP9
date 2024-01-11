package com.switchcase;

import java.util.Scanner;

public class GradeSystemSwitch {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Grade ");
		char grade=sc.next().charAt(0);
       
		switch(grade)
		{
		case 'A':
		case 'a':
			    System.out.println("Excellent");
			    break;
		case 'B':
		case 'b':
			    System.out.println("Good");
		case 'C':
		case 'c':
			    System.out.println("Average");
			    break;
		case 'D':
		case 'd':
			System.out.println("below Average");
			break;
		case 'F':
		case 'f':
			System.out.println("Fail");
			break;
		default:
				System.out.println("Invalid grade");
				break;
				
		}
sc.close();
	}

}
