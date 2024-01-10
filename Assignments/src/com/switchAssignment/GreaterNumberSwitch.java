package com.switchAssignment;

import java.util.Scanner;

public class GreaterNumberSwitch {
  public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Number1");
	  int num1=sc.nextInt();
	  System.out.println("Enter number2");
	  int num2=sc.nextInt();
	  int res=num1>num2?1:0;
	  
			  
	  switch(res)
	  {
	  case 1:
		  System.out.println("Number 1is greater");
		  break;
	  case 0:
		  
		  res=num1==num2?1:0;
		  switch(res)
		  {
		  case 1:
			  System.out.println("Number 1and number 2 are equal");
			  break;
		  case 0:
			  System.out.println("Number 2 is greater");
			  break;
			  
		  }
	  }
}
	
}
