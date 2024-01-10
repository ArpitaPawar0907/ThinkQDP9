package com.array;


import java.util.Scanner;

public class AddStringElement {

	static Scanner sc=new Scanner(System.in);
	public static void enterStringElement(String s[])
	{
		System.out.println("Enter string elemente");
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.next();
		}
		
		
	}
	
	public static void display(String s[])
	{
		for(String st:s)
		{
			System.out.println(st);
		}
	}
	
	public static void main(String[] args) {
		
		String str[]=new String[5];
		enterStringElement(str);
		display(str);
		
		sc.close();

	}

}
