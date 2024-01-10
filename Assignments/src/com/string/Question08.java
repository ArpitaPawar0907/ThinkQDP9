package com.string;
/*
 * 8.	Write a Java program to copy one string to another string.
 */
public class Question08 {

	public static void main(String[] args) {
		
		String str1="Arpita";
		
		String str2;
		str2=str1;
		System.out.println("First String :"+str1);
		System.out.println("----------------------");
		System.out.println("Second String :"+str2);
		System.out.println("----------------------");
		String str3=new String(str1);
		
		System.out.println("Third String :"+str3);

	}

}
