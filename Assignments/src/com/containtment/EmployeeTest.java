package com.containtment;

import java.util.Scanner;

public class EmployeeTest {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void enterDetails(Employee e)
	{
		System.out.println("Enter employee id");
		e.setEid(sc.nextInt());
		
		System.out.println("Enter employee name");
		e.setEname(sc.next());
		
		System.out.println("Enter salary");
		e.setSalary(sc.nextDouble());
		
	    e.setDepartment(new Department());
	    
	    System.out.println("enter department id");
	    e.getDepartment().setDid(sc.nextInt());
	    
	    System.out.println("Enter department name");
	    e.getDepartment().setDname(sc.next());
	    
	}

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		enterDetails(e1);
		System.out.println(e1);

	}

}
