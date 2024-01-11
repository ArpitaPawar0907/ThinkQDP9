package com.ifelse;

import java.util.Scanner;

public class BloodDonation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int age;
		System.out.println("Enter Age of person");
		age = sc.nextInt();
		if (age <= 18)
			System.out.println("Not eligible for blood donation");
		else if (age > 18 && age <= 50)
			System.out.println("Eligible for blood donation19");
		else
			System.out.println("not Eligible for blood donation");

	}

}
