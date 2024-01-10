package com.oopsAssignment;

import java.util.Scanner;

public class StudentQ15 {
	
	float s1,s2,s3,s4,s5,per;
	public void getDetail()
	 {
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter marks of 5 subjects");
		 s1=sc.nextFloat();
		 s2=sc.nextFloat();
		 s3=sc.nextFloat();
		 s4=sc.nextFloat();
		 s5=sc.nextFloat();
		
		 
	 }
	 
	public void displayDetail()
	 {
		per=(s1+s2+s3+s4+s5)/5;
		 if(per>85)
		  System.out.println("1st class");
		 else if(per>=70)
		       System.out.println("2nd class");
		      else if(per>=55)
		    	   System.out.println("3rd class");
		           else if(per>=35)
		        	     System.out.println("4th class");
		                else 
		        	    System.out.println("fail");
		 
	 }
	 
	public static void main(String[] args) {
		
		
		StudentQ15 std1=new StudentQ15();
		std1.getDetail();
		std1.displayDetail();
		
	}

}

