package com.throwkeyword;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		
		sc.close();
		
		if(age<0)
			throw new InputMismatchException();
		else
			System.out.println(" you are "+age+" years old");
	}

}
