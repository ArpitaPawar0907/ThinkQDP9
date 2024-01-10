package com.mapassignment;

import java.util.Map;
import java.util.TreeMap;

/*
 * 80. Implement hashcode and equals method to avoid duplicate 
entry of employees in hashmap. 
*/
public class Q80HashCodeEqualsMethods {

	public static void main(String[] args) {
		
TreeMap<Employee,Integer> emp=new TreeMap<>(new NameComperator());
		
		emp.put(new Employee(101,"arpita", 30000), 1);
		emp.put(new Employee(102,"pranay", 45000), 2);
		emp.put(new Employee(103,"nisha", 23000), 3);
		emp.put(new Employee(104,"reetu", 30000), 4);
		emp.put(new Employee(105,"prachi", 32000), 5);
	
		emp.put(new Employee(105,"prachi", 34200), 5);
		for(Map.Entry<Employee, Integer> en:emp.entrySet())
		{
			System.out.println(en.getKey());
			System.out.println(en.getValue());
			System.out.println("---------------------------");
		}

	}
}
