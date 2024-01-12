package com.outputquestions;

import java.util.ArrayList;
import java.util.Collections;

public class Q1ArrayListSort {
public static void main(String[] args) {
		ArrayList<Employee> alEmp = new ArrayList<Employee>();
        Employee e1 = new Employee(3, "Ajit");
        Employee e2 = new Employee(4,"Suman") ;
        Employee e3 = new Employee(2, "Radhika" ) ;
        Employee e4 = new Employee(1, "Sameer") ;
        alEmp.add(e1);
        alEmp.add(e2);
        alEmp.add(e3);
        alEmp.add(e4); 

        Collections.sort(alEmp);
        
        for(Employee e:alEmp)
        {
        	System.out.println(e);
        }
}}