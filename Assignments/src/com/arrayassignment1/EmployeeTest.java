package com.arrayassignment1;

import java.util.Scanner;

public class EmployeeTest {
 static Scanner sc=new Scanner(System.in);
	public static void enterDetails(Employee e)
	{
		
	
		System.out.println("Enter id");
		e.setId(sc.nextInt());
		
		System.out.println("Enter name");
		e.setName(sc.next());
		
		System.out.println("Enter salary");
		e.setSalary(sc.nextDouble());
		
	}
	public static void printSalary(Employee e[])
	{
		for(int i=0;i<e.length;i++)
		{
			if(e[i].getSalary()==e[i+1].getSalary())
				System.out.println(e[i]);
		}
	}
	public static void display(Employee e[])
	{
		for(Employee e1:e)
		{
			System.out.println(e1);
		}
	}
	public static void main(String[] args) {
		

		Employee e1[]=new Employee[3];
		for(int i=0;i<e1.length;i++)
		{
			e1[i]=new Employee();
			enterDetails(e1[i]);
		}
		sc.close();
	}

}
