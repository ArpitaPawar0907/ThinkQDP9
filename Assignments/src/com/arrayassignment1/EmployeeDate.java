package com.arrayassignment1;

import java.util.Scanner;

public class EmployeeDate {
 static Scanner sc=new Scanner(System.in);
	public static void enterDetails(MyEmployee e)
	{
		
	
		System.out.println("Enter id");
		e.setId(sc.nextInt());
		
		System.out.println("Enter name");
		e.setName(sc.next());
		
		System.out.println("Enter salary");
		e.setSalary(sc.nextDouble());
		
		e.setDate(new Date());
		
	     System.out.println("Enter Date");
	     
	     System.out.println("Enter Day");
	     e.getDate().setDay(sc.nextInt());
	     
	     System.out.println("Enter month");
	     e.getDate().setMonth(sc.nextInt());

	     System.out.println("Enter year");
	     e.getDate().setYear(sc.nextInt());
	     
	     e.setDept(new Department());
	     

	     System.out.println("Enter department id");
	     e.getDept().setDid(sc.nextInt());
	     
	     System.out.println("Enter department name");
	     e.getDept().setDname(sc.next());
		
		
	}
	
	public static void displayDepartment(MyEmployee e[])
	{
		for(int i=0;i<e.length;i++)
		{
			if((e[i].getDept().getDname())==(e[i+1].getDept().getDname()))
				System.out.println(e[i]);
		}
	}
	
	public static void display(MyEmployee e[])
	{
		for(MyEmployee e1:e)
		{
			System.out.println(e1);
		}
	}
	public static void main(String[] args) {
		

		MyEmployee e1[]=new MyEmployee[3];
		for(int i=0;i<e1.length;i++)
		{
			e1[i]=new MyEmployee();
			enterDetails(e1[i]);
		}
		sc.close();
	}

}
