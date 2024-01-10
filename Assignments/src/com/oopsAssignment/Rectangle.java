package com.oopsAssignment;

import java.util.Scanner;

public class Rectangle {
	
	 double len;
	 double hei,res;
	 void getData(double l,double h)
	 {
		 len=l;
		 hei=h;
		 
		 
	 }
	 void displayData()
	 {
		 res=len*hei ;
         System.out.println("Area of Rectangle"+res);
	
	 }
	 

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		Rectangle r3=new Rectangle();
		r1.getData(35.7, 45.3);
		r1.displayData();
		  System.out.println("Enter Lenght of Rectangle ");
          double lenght=sc.nextDouble();
          System.out.println("Enter Breath of Rectangle");
          double breath=sc.nextDouble();
         
		r2.getData(lenght, breath); 
		r2.displayData();
		 System.out.println("Enter Lenght of Rectangle ");
         double lenght1=sc.nextDouble();
         System.out.println("Enter Breath of Rectangle");
         double breath1=sc.nextDouble();
		r3.getData(lenght1,breath1);
		r3.displayData();
       sc.close();
	}

}
