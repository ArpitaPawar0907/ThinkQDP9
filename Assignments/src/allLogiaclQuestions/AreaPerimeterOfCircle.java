package allLogiaclQuestions;

import java.util.Scanner;

public class AreaPerimeterOfCircle {
     public static void area(int radius)
     {
    	  
         System.out.println("Area of circle"+(3.14*(radius*radius)));			   
     }
     public static void perimeter(int radius)
     {
    	 
         System.out.println("Circumference of a circle "+(2*3.14*radius));
     }
     
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter radius ");
	    int r=sc.nextInt();
	     
	     area(r);
	     perimeter(r);
	     sc.close();

	}

}
