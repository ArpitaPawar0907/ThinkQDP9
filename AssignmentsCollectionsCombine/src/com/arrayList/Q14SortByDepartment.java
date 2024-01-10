package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 14. Sort arraylist of employees on department names using 
comparator interface. 
 */
public class Q14SortByDepartment {

	public static void main(String[] args) {
		

		ArrayList<Employee> elist=new ArrayList<>();
		
		elist.add(new Employee(101,"arpita", 30000,new Department(1,"HR")));
		elist.add(new Employee(102,"pranay", 40000,new Department(2,"technical")));
		elist.add(new Employee(103,"reetu", 30000,new Department(1,"HR")));
		elist.add(new Employee(104,"Prachi", 30000,new Department(3,"sales")));
		elist.add(new Employee(105,"nisha", 40000,new Department(2,"technical")));
		
		Collections.sort(elist, new DeparmentComparator());
		for(Employee e:elist)
		{
			System.out.println(e);
		}

	}

}
