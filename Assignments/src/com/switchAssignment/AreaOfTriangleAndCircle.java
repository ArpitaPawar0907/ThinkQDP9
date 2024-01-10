package com.switchAssignment;

import java.util.Scanner;

public class AreaOfTriangleAndCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Circle");
		System.out.println("2. Square");
		System.out.println("3. Triangle");
		System.out.println("4. Rectangle");
		System.out.println("Enter Your Choice");
		int ch=sc.nextInt();
		double res;
		switch(ch)
		{
		
		case 1: System.out.println("Enter Radius of Circle");
		        double radius=sc.nextDouble();
		        System.out.println("1. Area of Circle");
				System.out.println("2. Circumference of circle");
				System.out.println("Enter Your Choice");
				int c1=sc.nextInt();
				switch(c1)
				{
		          case 1:
		        	   res= 3.14*(radius*radius);
		                 System.out.println("Area of circle"+res);			   
		          break;
	              case 2: 
	            	   res=2*3.14*radius; 
		                 System.out.println("Circumference of a circle "+res);
		          break;
		          default:
		        	     System.out.println("Invalid choice ");
				} 	  
			    		   
			    break;
		case 2: 
			    System.out.println("Enter Side of square");
		        double side=sc.nextDouble();
		        System.out.println("1. Area of Square");
				System.out.println("2. Perimeter of square");
				System.out.println("Enter Your Choice");
				int c2=sc.nextInt();
				switch(c2)
				{
		          case 1:
		        	     res=side*side ;
		                 System.out.println("Area of square"+res);			   
		          break;
	              case 2: 
	            	     res=4*side; 
		                 System.out.println("Perimeter of square "+res);
		          break;
		          default:
		        	     System.out.println("Invalid choice ");
				}
			    
			    break;
		case 3: 
			  System.out.println("Enter Lenght of triangle ");
	          double base=sc.nextDouble();
	          System.out.println("Enter Breath of triangle");
	          double height=sc.nextDouble();
			  res=(1/2)*base*height ;
              System.out.println("Area of triangle"+res);
			    break;
		case 4:
			  System.out.println("Enter Lenght of Rectangle ");
	          double lenght=sc.nextDouble();
	          System.out.println("Enter Breath of Rectangle");
	          double breath=sc.nextDouble();
			  res=lenght*breath ;
              System.out.println("Area of Rectangle"+res);
		default:
			    System.out.println("Invalid choice");
		
		}
		

		sc.close();


	}

}
