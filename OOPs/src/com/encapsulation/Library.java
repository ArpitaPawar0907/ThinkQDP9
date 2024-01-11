package com.encapsulation;

import java.util.Scanner;

public class Library {
	static Scanner sc=new Scanner(System.in);
	public static void insert(Book b)
	{
		System.out.println("Enter the Book id");
		b.setId(sc.nextInt());
		System.out.println("Enter Bookname");
		b.setBname(sc.next());
		System.out.println("Enter the price");
		b.setPrice(sc.nextDouble());
	}

	public static void main(String[] args) {
		
		Book b1=new Book();
		
		insert(b1);
		
		Book b2=new Book();
		insert(b2);
		System.out.println(b1);
		System.out.println(b2);
		
		
		

	}

}
