package com.designDemo;

import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the developer to hire(java,python, fullstack):");
		
		String dtype=sc.next();
		
		GetDeveloper gd= new GetDeveloper();
		
		Developer d=gd.getDeveloper(dtype);
		
		if(d==null)
		{
			System.out.println("Developer not found");
		}	
		
		else
		{
			System.out.println("Enter the employee name:");
			d.setName(sc.next());
			
			System.out.println("------------------------------------------");
			
			System.out.println("Welcome to company "+d.getName());
			d.salaryPaid();
			System.out.println("Salary :"+d.salary);
			d.workingHours();
			
			System.out.println("Working hours:"+d.noOfHour);
			
			System.out.println("Skill set:");
	     	d.skillSet();
	     	System.out.println("------------------------------------------");
		}


	}

}
