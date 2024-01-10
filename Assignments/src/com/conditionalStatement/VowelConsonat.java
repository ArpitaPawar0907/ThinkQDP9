package com.conditionalStatement;

import java.util.Scanner;

public class VowelConsonat {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		String s=sc.next();
		 
		if(s=="a" || s=="e"||s=="i"||s=="o"||s=="u")
		{
			System.out.println(s +" is Vowel");
		}
	  else 
	  {
	   System.out.println(s +" Character is consonanat");
	  }
      sc.close();
	}

}
