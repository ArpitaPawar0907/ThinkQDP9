package allLogiaclQuestions;

import java.util.Scanner;

public class YearWeeksDay {
 
	public static void calculateDays(int day)
	{
		int year;
		int week;
		int daysInWeek;
		year=day/365;
		week=(day%365)/day;
		daysInWeek=(day%365)/day;
		System.out.println("Year:"+year);
		System.out.println("Week:"+week);
		System.out.println("Days:"+daysInWeek);
		
	}
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Days ");
	     int n1=sc.nextInt();
	   calculateDays(n1);
	}
}
