package com.setassignment;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * 55. Create linked hashset of employee objects. Iterate through it 
using foreach loop and iterator. Observe the order.
 */
public class Q55EmployeeLinkedHashSet {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Employee> eSet=new LinkedHashSet<Employee>();
		
		eSet.add(new Employee(101, "arpita", 30000));
		eSet.add(new Employee(102, "pranay", 40000));
		eSet.add(new Employee(103, "reetu", 25000));
		eSet.add(new Employee(104, "prachi", 21000));
		eSet.add(new Employee(105, "pooja", 10000));
		
		Iterator<Employee> itr=eSet.iterator();
		System.out.println("Iterator :");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------");
		System.out.println("For each loop:");
		for(Employee e:eSet)
		{
			System.out.println(e);
		}
		
		
	}

}
