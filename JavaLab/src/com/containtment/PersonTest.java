package com.containtment;

import java.util.Scanner;

public class PersonTest {
	
	static Scanner sc=new Scanner(System.in);
	
    public static void enterDetails(Person p)
    {
    	
    	System.out.println("Enter name of person");
    	p.setName(sc.next());
    	
    	System.out.println("Enter age");
    	p.setAge(sc.nextInt());
    	
    	System.out.println("Enter email");
    	p.setEmail(sc.next());
    	
    	p.setAddr(new Address());
    	
    	System.out.println("Enter room no");
    	p.getAddr().setRoomNo(sc.nextInt());
    	
    	System.out.println("Enter city");
    	p.getAddr().setCity(sc.next());
    	
    	System.out.println("Enter pincode");
    	p.getAddr().setPincode(sc.nextLong());
    	
    	
    	
    	
    	
    }
	public static void main(String[] args) {
		
		Person p1=new Person();
		enterDetails(p1);
		
		System.out.println(p1);

	}

}
