package com.vectorassignment;

import java.util.Collections;
import java.util.Vector;

/*
 * 99. Create vector of employee objects. Delete employee object if 
salary of employee is < 5000


 */
public class Q99RemoveEmployee {

	public static void main(String[] args) {
		
		Vector<Employee> emp=new Vector<>();
		
		emp.add(new Employee(101,"arpita", 45000));
		emp.add(new Employee(102,"nisha", 40000));
		emp.add(new Employee(103,"pranay", 48000));
		emp.add(new Employee(104,"reetu", 55000));
		emp.add(new Employee(105,"pooja", 65000));
		
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}

		for(int i=0;i<emp.size();i++)
		{
			if(emp.get(i).getSalary()>50000)
			{
				emp.remove(i);
			}
		}
		System.out.println();
		for(Employee e:emp)
		{
			System.out.println(e);
		}
	}
}
