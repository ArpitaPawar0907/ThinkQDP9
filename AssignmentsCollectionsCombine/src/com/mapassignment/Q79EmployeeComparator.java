package com.mapassignment;

import java.util.Map;
import java.util.TreeMap;

/*
 * 79. Create treemap using treemap(comparator) constructor. 
Create name comparater of employee class and pass it to 
constructor. 
 */
public class Q79EmployeeComparator {

	public static void main(String[] args) {
		
		TreeMap<Employee,Integer> emp=new TreeMap<>(new NameComperator());
		
		emp.put(new Employee(101,"arpita", 30000), 1);
		emp.put(new Employee(101,"pranay", 45000), 2);
		emp.put(new Employee(101,"nisha", 23000), 3);
		emp.put(new Employee(101,"reetu", 30000), 4);
		emp.put(new Employee(101,"prachi", 32000), 5);
		
		for(Map.Entry<Employee, Integer> en:emp.entrySet())
		{
			System.out.println(en.getKey());
			System.out.println(en.getValue());
			System.out.println("---------------------------");
		}
	}
}
