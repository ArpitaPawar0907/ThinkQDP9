package com.containtment;

import java.util.Scanner;

public class PersonTest {
	
	static Scanner sc=new Scanner(System.in);
	public static void enterDetails(Person p)
	{
		System.out.println("Enter Person name");
		p.setName(sc.next());
		
		System.out.println("Enter person gender");
		p.setGender(sc.next());
		
		System.out.println("Enter age");
		p.setAge(sc.nextInt());
		
		p.setAddr(new Address());
		
		System.out.println("Enter city");
		p.getAddr().setCity(sc.next());
		
		System.out.println("Enter State");
		p.getAddr().setState(sc.next());
		
		System.out.println("Enter contry");
		p.getAddr().setCountry(sc.next());
		
	}

	public static void main(String[] args) {
	
		Person p1=new Person();
		
		enterDetails(p1);
		
		System.out.println(p1);

	}

}
