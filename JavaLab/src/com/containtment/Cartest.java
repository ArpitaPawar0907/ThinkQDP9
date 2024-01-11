package com.containtment;

import java.util.Scanner;

public class Cartest {
	static Scanner sc=new Scanner(System.in);
	
	public static void enterDetails(Car c)
	{
		
		System.out.println("Enter car id");
		c.setCid(sc.nextInt());
		
		System.out.println("Enter car name");
		c.setCname(sc.next());
		
		c.setEngine(new Engine());
		System.out.println("Enter engine type");
		c.getEngine().setEtype(sc.next());
		
	}

	public static void main(String[] args) {

		Car c1=new Car();
		
		enterDetails(c1);
		
		System.out.println(c1);
		

	}

}
