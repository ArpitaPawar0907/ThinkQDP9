package com.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class EmployeeTest {

	public static void main(String[] args) {
	
		LinkedList<Employee> empList=new LinkedList<>();
		
		empList.add(new Employee(101,"Arpita",30000));
		empList.add(new Employee(102,"Reetu", 40000));
		empList.add(new Employee(103,"Pranay",45000));
		empList.add(new Employee(104, "Pranali", 30000));
		
		
		for(Employee e:empList)
		{
			System.out.println(e);
		}
        System.out.println("-------------------------");
		Collections.sort(empList);
		for(Employee e:empList)
		{
			System.out.println(e);
		}

	}

}
