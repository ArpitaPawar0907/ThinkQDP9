package com.outputquestions;

import java.util.ArrayList;
import java.util.Collections;

public class Q2ArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> alEmp = new ArrayList<Employee>();
		Employee e1 = new Employee(3, "Ajit");
		Employee e2 = new Employee(4,"Suman") ;
		alEmp.add(e1);
		alEmp.add(e2);

		Collections.sort(alEmp, new EmpNameComparator());
		
		System.out.println(alEmp);
	}	
}
