package com.conditionalStatement;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary");
		double salary = sc.nextDouble();
		double hra=0, da=0;
		if (salary <= 10000) {
			hra = salary * 0.2;
			da = salary * 0.8;
		} else if (salary <= 20000) {
			hra = salary * 0.25;
			da = salary * 0.9;
		} else if (salary > 20000) {
			hra = salary * 0.3;
			da = salary * 0.95;
		}
		
		System.out.println("Salary of employee :"+salary);
		System.out.println("HRA"+hra);
          System.out.println("DA"+da);
          sc.close();
	}

}
