package com.loops;

import java.util.Scanner;

public class Addition {
	public static void addition()
	{
	Scanner sc=new Scanner(System.in);
	 char ch;
    do
    {
   	 System.out.println("Enter numbeer1");
	     int num1=sc.nextInt();
	     System.out.println("Enter number 2");
	     int num2=sc.nextInt();
	   
	    
   	 
   	System.out.println("Addition :"+(num1+num2));
   	System.out.println("Do you want to continue (y/n)");
   	ch=sc.next().charAt(0);
    }while(ch=='y');
	}
	public static void main(String[] args) {
		
		
	addition();

	}

}
