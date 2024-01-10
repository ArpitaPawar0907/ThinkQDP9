package com.oopsAssignment;

import java.util.Scanner;

public class MainOutside {

	public static void main(String[] args) {
		Employ e1=new Employ();
		Employ e2=new Employ();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		System.out.println("Enter name");
		String n=sc.next();
		System.out.println("Enter Experiance");
		float b=sc.nextFloat();
		System.out.println("Enter Salary");
		float c=sc.nextFloat();

		e1.getDetails(1, "Abc",3.4f,12000.9f);
		e1.displayDetail();

		e2.getDetails(a, n, b, c);
        e2.displayDetail();

		

   sc.close();
	}

}
