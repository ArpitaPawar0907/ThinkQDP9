package com.arrayofobject;

import java.util.Scanner;

import com.arrayassignment1.Date;
import com.arrayassignment1.Department;
import com.arrayassignment1.MyEmployee;

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
	
	public static void displayDepartment(MyEmployee e1[],Department d1[])
	{
		 for(Department d:d1)
		    {
		    	System.out.println(d);
		    	for(MyEmployee e:e1)
		    	{
		    		if(e.getDept().equals(d))
		    			System.out.println(e.getName());
		    	}
		    }
	}
	public static void displayDate(MyEmployee e1[],Date d1[])	
	{
	    for(Date d:d1)
	    {
	    	System.out.println(d);
	    	for(MyEmployee e:e1)
	    	{
	    		if(e.getDate().equals(d))
	    			System.out.println(e.getName());
	    	}
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
		

		MyEmployee e1[]=new MyEmployee[5];
//		for(int i=0;i<e1.length;i++)
//		{
//			e1[i]=new MyEmployee();
//			enterDetails(e1[i]);
//		}
		Department d[]=new Department[3];
		 d[0]=new Department(101, "PR");
		 d[1]=new Department(102, "Sales");
		 d[2]=new Department(103, "Techniacal");
		
		 
		 Date date[]=new Date[3];
		 date[0]=new Date(2, 3, 2021);
		 date[1]=new Date(5, 2, 2022);
		 date[2]=new Date(23, 10, 2023);
		
		e1[0]=new MyEmployee(101, "Arpita", 23000,date[0] ,d[1]);
		e1[1]=new MyEmployee(102, "Reetu", 34000,date[1] ,d[0]);
		e1[2]=new MyEmployee(103, "Pranay", 43000,date[0] ,d[1]);
		e1[3]=new MyEmployee(104, "Pooja", 11000,date[2] ,d[2]);
		e1[4]=new MyEmployee(105, "Jyoti", 20000,date[1] ,d[0]);
		
		display(e1);
		System.out.println("-------------------------------------------------");
		displayDepartment(e1,d);
		System.out.println("----------------------------------------------------");
		displayDate(e1, date);
		sc.close();
	}

}
