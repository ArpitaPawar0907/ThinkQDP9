package com.ifelse;

import java.util.Scanner;

public class GraddingLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the percentage");
		float per = sc.nextFloat();
		char grade;
		if (per >= 90)
			grade = 'A';
		    else if (per >= 75)
			        grade = 'B';
		         else if (per >= 60)
			          grade = 'C';
		              else if (per >= 40)
			               grade = 'D';
		                   else
			               grade = 'F';

		if (grade == 'F')
		{
            System.out.println("Sorry you are Failed");
		}
		else
		{
			System.out.println("Congratulation you have passed with grade"+grade);
		}
sc.close();
	}

}
