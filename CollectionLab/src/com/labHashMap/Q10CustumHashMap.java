package com.labHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q10CustumHashMap {

	public static void searchKey(HashMap<Employee,Integer> emp,Employee e)
	{
		if(emp.containsKey(e))
		{
			System.out.println("Key found");
			emp.get(e);
		}
		else
		{
			System.out.println("Key is not found");
		}
		
	}
	public static void main(String[] args) {
		
		HashMap<Employee,Integer> empHm=new HashMap<>();
		
		empHm.put( new Employee(101, "arpita"),1);
		empHm.put( new Employee(102, "nisha"),2);
		empHm.put( new Employee(103, "pranay"),3);
		empHm.put( new Employee(104, "reetu"),4);
		empHm.put( new Employee(105, "pooja"),4);
		
		Set<Employee> keys=empHm.keySet();
		for(Employee e:keys)
		{
			System.out.println(e+"-->"+empHm.get(e));
		}
		System.out.println("-----------------------------------------------");
		
		//searchKey(empHm);

	}

}
