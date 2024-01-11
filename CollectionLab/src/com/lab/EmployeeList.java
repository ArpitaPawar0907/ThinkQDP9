package com.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeList {

	public static void EmployeeByCharacter(ArrayList<Employee> list, char c) {

		ArrayList<Employee> chEmp=new ArrayList<Employee>();
		
		for(Employee e:list)
		{
			if(e.getEname().charAt(0)==c)
			{
				chEmp.add(e);
			}
		}
		Collections.sort(chEmp, new NameComparator());
		display(chEmp);
	}

	public static void findHighestSalary(ArrayList<Employee> list) {
		Employee temp = new Employee();
		double highSal = 0;
		for (Employee e : list) {
			if (e.getSalary() > highSal) {
				highSal = e.getSalary();
				temp = e;
			}
		}
		System.out.println("Higest salary :");
		System.out.println(temp);
	}

	public static void sortDepartment(ArrayList<Employee> list, Department d1[]) {

		for (Department d : d1) {
			System.out.println(d);

			for (Employee e : list) {
				if (e.getDept().equals(d)) {
					System.out.println(e);
				}
			}
			System.out.println("----------------------");
		}
	}

	public static void findDepartment(ArrayList<Employee> list, String dname) {

		for (Employee e : list) {
			if (e.getDept().getDname().equalsIgnoreCase(dname)) {
				System.out.println(e);
			}
		}
	}

	public static void display(ArrayList<Employee> list) {
		for (Employee e : list) {
			System.out.println(e);
		}
	}

	public static void sortById(ArrayList<Employee> list) {
		Collections.sort(list, new IdComparator());
	}

	public static void sortByDepartmentName(ArrayList<Employee> list) {
		Collections.sort(list, new DepartmentComparator());
	}

	public static void sortByName(ArrayList<Employee> list) {
		Collections.sort(list, new NameComparator());
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> emp = new ArrayList<>();

		Department d[] = new Department[3];
		d[0] = new Department(101, "IT", "Pune");
		d[1] = new Department(102, "HR", "Mumbai");
		d[2] = new Department(103, "Sales", "Pune");

		emp.add(new Employee(1, "Jyoti", 30000, d[1]));
		emp.add(new Employee(3, "Pranay", 40000, d[0]));
		emp.add(new Employee(6, "Prachi", 34000, d[2]));
		emp.add(new Employee(5, "Nisha", 30000, d[0]));
		emp.add(new Employee(4, "Reetu", 40000, d[1]));
		emp.add(new Employee(9, "Pranali", 45000, d[1]));
		emp.add(new Employee(7, "Pooja", 43000, d[2]));
		emp.add(new Employee(2, "Arpita", 45000, d[0]));

		// emp.add(new Employee(108, "Reetu", 40000,new Department(did, dname, dloc)));

		Collections.sort(emp);

		display(emp);

		System.out.println("------------------------------------");
		findHighestSalary(emp);

		System.out.println("Enter character");
		char ch = sc.next().charAt(0);
		EmployeeByCharacter(emp, ch);

		sc.close();

	}

}
