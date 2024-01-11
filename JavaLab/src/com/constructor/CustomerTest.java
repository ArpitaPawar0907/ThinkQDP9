package com.constructor;

public class CustomerTest {

	public static void main(String[] args) {
	
		Customer c1=new Customer();
		
		System.out.println(c1);
		System.out.println("------------------------------------------------------");
		Customer c2=new Customer(101,"Arpita","arpita@gamil.com","123@abc",9876543210l);
         System.out.println(c2);
         
	}

}
