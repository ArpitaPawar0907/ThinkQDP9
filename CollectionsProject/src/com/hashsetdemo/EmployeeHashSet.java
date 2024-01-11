package com.hashsetdemo;

import java.util.HashSet;

public class EmployeeHashSet {
	
	public static void main(String[] args) {
		
		HashSet<Employee> empHs=new HashSet<Employee>();
		
		empHs.add(new Employee(101,"arpita",30000));
		empHs.add(new Employee(102,"prachi",32000));
		empHs.add(new Employee(102,"prachi",20000));
		empHs.add(new Employee(103,"reetu",32000));
		empHs.add(new Employee(104,"nisha",20000));
		
		for(Employee e:empHs)
		{
			System.out.println(e);
		}
	
	}

}
