package com.constructor;

import java.util.Scanner;

public class CustomerTest2 {
	
	public static void addCustomer(Customer c)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id :");
		c.setCustomerId(sc.nextInt());
		
		System.out.println("Enter Customer Name:");
		c.setCustomerName(sc.next());
		
		System.out.println("Enter Customer Email");
		c.setCustomerEmail(sc.next());
		
		System.out.println("Enter Password");
		c.setCustomerPass(sc.next());
		
		System.out.println("Enter Contact");
		c.setContact(sc.nextLong());
		
	
//	Customer c2=new Customer(setCustomerId(sc.nextInt()),setCustomerName(sc.next()),setCustomerEmail(sc.next()),setCustomerPass(sc.next()),setContact(sc.nextLong()));
		
		
		//Customer c2=new Customer();
		
	}
    public static void displayCustomer(Customer c)
    {
    	System.out.println(c);
    }
	public static void main(String[] args) {
	
		Customer c1=new Customer();
		
		addCustomer(c1);
		displayCustomer(c1);
		

	}

}
