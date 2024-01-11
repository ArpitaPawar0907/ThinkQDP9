package com.enumdemo;

import java.util.Scanner;

public class BookTickets {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Movies seat");
		System.out.println("1.standard :"+MovieSeats.STANDARD.price);
		System.out.println("2.Premiun :"+MovieSeats.PREMIUM.price);
		System.out.println("3.Recliner :"+MovieSeats.RECLINER.price);
		
		int seatType=sc.nextInt();
		
		MovieSeats ms=null;
		switch(seatType)
		{
		case 1:
			   ms=MovieSeats.STANDARD;
			   break;
		case 2:
			   ms=MovieSeats.PREMIUM;
			   break;
		case 3:
			  ms=MovieSeats.RECLINER;
			  break;
	    default: System.out.println("error....");
	       break;
		}
		System.out.println("Enter number of seats");
		int n=sc.nextInt();
		
		System.out.println("----------------------------");
		System.out.println("Type of seat :"+ms);
		System.out.println("Price of one ticket"+ms.price);
		System.out.println("Total bill"+(n*ms.price));
		
		sc.close();
	}
}
