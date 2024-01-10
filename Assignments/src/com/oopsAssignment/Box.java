package com.oopsAssignment;

import java.util.Scanner;

public class Box {
    
	 float length,width,height,volume;
	 void getDetail()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Length of the box");
		 length=sc.nextFloat();
		 System.out.println("Enter width of the box");
		 width=sc.nextFloat();
		 System.out.println("Enter height of the box");
		 height=sc.nextFloat();
		 
	 }
	 void display()
	 {
		 volume=length*width*height;
		 System.out.println("Volume of Box : "+volume);
	 }
	public static void main(String[] args) {
		Box b1=new Box();
		b1.getDetail();
		b1.display();

	}

}

