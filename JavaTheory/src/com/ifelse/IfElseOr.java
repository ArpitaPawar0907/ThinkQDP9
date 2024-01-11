package com.ifelse;

import java.util.Scanner;

public class IfElseOr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total percentage");
		double totalPer=sc.nextDouble();
		System.out.println("Enter marks of best 4");
       double best4=sc.nextDouble();
       
       if(totalPer>75 ||best4>80)
       {
    	 System.out.println("Congratulation! you are eligible for college");  
       }
       else
       {
    	   System.out.println("Sorry !Better luck next time");
       }
      sc.close();
	}

}
