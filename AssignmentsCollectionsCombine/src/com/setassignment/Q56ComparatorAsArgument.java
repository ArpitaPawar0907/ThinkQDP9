package com.setassignment;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * 56. Create treeset using constructor which accepts comparater 
as input argument.

 */
public class Q56ComparatorAsArgument {
	
	public static void main(String[] args) {
		
		TreeSet<Employee> emp=new TreeSet<Employee>(new SalaryComperator());
		
		emp.add(new Employee(101, "arpita", 30000));
		emp.add(new Employee(102, "pranay", 40000));
		emp.add(new Employee(103, "reetu", 25000));
		emp.add(new Employee(104, "prachi", 21000));
		emp.add(new Employee(105, "pooja", 10000));
		
		Iterator<Employee> itr=emp.iterator();
	
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
