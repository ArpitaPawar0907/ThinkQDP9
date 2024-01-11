package com.ifelse;

import java.util.Scanner;

public class IfElseAnd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Items");
		int noOfItem=sc.nextInt();
		System.out.println("Enter Cost of Item");
       double costPerItem=sc.nextDouble();
       
       double total=noOfItem*costPerItem;
       if(noOfItem>10 &&total>2000)
       {
    	   System.out.println("Total :"+total);
    	   System.out.println("Discount offered by 10%");
    	   total=total-(0.1*total);
    	   
       }
       System.out.println("Total Bill is "+total);
      sc.close(); 
	}

}
