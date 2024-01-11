package com.customexception;

import java.util.Scanner;



public class NameAccept {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		sc.close();
		try
		{
		if(name.length()<=2)
			throw new InvalidNameException(" Name Should be greater than 2 character");
		
		
		System.out.println("Welcome "+name);
		}catch (Exception e) {
			
			System.out.println(e);
			
			
		}
		
	
	}

}
