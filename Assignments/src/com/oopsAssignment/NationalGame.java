package com.oopsAssignment;

import java.util.Scanner;

public class NationalGame {

	public static void games()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Country");
		String country=sc.next();
		switch(country)
		{
		case "india":
		case "India":
			         System.out.println(country+" national game is hocky");
			         break;
		case "china":
		case "China":
			          System.out.println(country+" national game is Table tennis");
			          break;
		case "bangladesh":
		case "Bangladesh":
			          System.out.println(country+" national game is Kabbadi");
			          break;
		case "italy":
		case "Italy":
			          System.out.println(country+" national game is FootBall");
			          break;
		case "united state":
		case "United state":
			          System.out.println(country+" national game is baseball");
		
		}
	}
	
	public static void main(String[] args) {
		
		games();

	}

}
