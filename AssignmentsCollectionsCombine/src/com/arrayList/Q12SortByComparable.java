package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 12. Sort arraylist of employees on employee names using 
comparable interface. 
 */
public class Q12SortByComparable {

	public static void main(String[] args) {
		

		ArrayList<Employee> elist=new ArrayList<>();
		
		elist.add(new Employee(101,"arpita", 30000,new Department(1,"HR")));
		elist.add(new Employee(102,"pranay", 40000,new Department(2,"technical")));
		elist.add(new Employee(103,"reetu", 30000,new Department(1,"HR")));
		elist.add(new Employee(101,"prachi", 30000,new Department(3,"sales")));
		elist.add(new Employee(101,"nisha", 40000,new Department(2,"technical")));
		
		Collections.sort(elist);
		for(Employee e:elist)
		{
			System.out.println(e);
		}

		
	}

}
