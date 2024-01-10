package com.arrayList;

import java.util.ArrayList;

import java.util.List;

/*
 * 9. Use copy method of collections class to make a copy of given 
arraylist of employees. Check if it creates shallow copy or deep 
copy. Check if department objects are also copied.
 */
public class Q09CheckCopy {

	public static void main(String[] args) {
		
		ArrayList<Employee> elist=new ArrayList<>();
		
		
		elist.add(new Employee(101,"arpita", 30000,new Department(1,"HR")));
		elist.add(new Employee(102,"pranay", 40000,new Department(2,"technical")));
		elist.add(new Employee(103,"reetu", 30000,new Department(1,"HR")));
		elist.add(new Employee(101,"Prachi", 30000,new Department(3,"sales")));
		elist.add(new Employee(101,"nisha", 40000,new Department(2,"technical")));
		ArrayList<Employee> newList=new ArrayList<Employee>(List.copyOf(elist));
		
		
		
		
		for(Employee e:newList)
		{
			System.out.println(e);
		}
		
	}

}
