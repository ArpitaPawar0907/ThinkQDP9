package com.loops;

import java.util.Scanner;

public class ArithematicOperation {

	public static void operation()
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter numbeer1");
	     int num1=sc.nextInt();
	     System.out.println("Enter number 2");
	     int num2=sc.nextInt();
		int ch;
	     char ch1;
	     do
	     {
	    	 System.out.println("Enter Opertion you want to perform");
	    	 System.out.println("1.Addition");
	    	 System.out.println("2.Subtraction");
	    	 System.out.println("3.Multiplication");
	    	 System.out.println("4.Division");
	    	 System.out.println("Enter your choice");
	    	 ch=sc.nextInt();
	    	 switch(ch)
	    	 {
	    	 case 1:
	    		 System.out.println("Addition: "+(num1+num2));
	    		 break;
	    	 case 2:
	    		 System.out.println("subtraction:"+(num1-num2));
	    		 break;
	    	 case 3:
	    		 System.out.println("Multiplication"+(num1*num2));
	    		 break;
	    	 case 4:
	    		  System.out.println("Division"+num1/num2);
	    		  break;
	    	 default:
	    		 System.out.println("Invalid operation");
	    	      break;
	    	 }
	    	 System.out.println("Do you want to continue(y/n)");
	    	 ch1=sc.next().charAt(0);
	    	 
	     }while(ch1=='y');
		
	}
	public static void main(String[] args) {
      
	
	
     
     operation();
     }

}
