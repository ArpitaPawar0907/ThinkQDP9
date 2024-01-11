package com.loops;

import java.util.Scanner;

public class PositiveNegative {
	public static void countPositiveNumber() {
		Scanner sc = new Scanner(System.in);
		char ch;
		int couPositive = 0;
		int couNeg = 0;
		int couzero = 0;
		do {
			System.out.println("Enter the Number");
			int num = sc.nextInt();
			if (num > 0) 
				couPositive++;
			 else if (num < 0) 
				couNeg++;
                 else 
                	 couzero++;
			

			System.out.println("Do you wnat to continue(y/n)");
			ch = sc.next().charAt(0);

		} while (ch == 'y');

		System.out.println("Positive " + couPositive);
		System.out.println("Negative:" + couNeg);
		System.out.println("Zero:" + couzero);

	}

	public static void main(String[] args) {

		countPositiveNumber();

	}

}
