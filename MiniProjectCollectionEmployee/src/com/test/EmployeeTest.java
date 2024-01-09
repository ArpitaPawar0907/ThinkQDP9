package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.EmployeeDaoImpl;
import com.pojo.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		int eid;
		String ename;
		double salary;
		int choice;
		char ch;
		Employee emp;
		List<Employee> elist = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);

		EmployeeDaoImpl edao = new EmployeeDaoImpl();
		do {
			System.out.println("----------Employee -------------------");
			System.out.println("---------------------------------------");
			System.out.println("1.Add Employee");
			System.out.println("2.Update Employee");
			System.out.println("3.Delete Employee");
			System.out.println("4.Show Employee list");
			System.out.println("5.Search by employee id");
			System.out.println("---------------------------------------------");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("-----add Employee----------");
				System.out.println("How many employee you want to add");
				int num = sc.nextInt();
				for (int i = 0; i < num; i++) {
					System.out.println("Enter Employee id");
					eid = sc.nextInt();

					System.out.println("Enter name");
					ename = sc.next();

					System.out.println("Enter salary");
					salary = sc.nextDouble();
					
					emp=new Employee(eid, ename, salary);
					
					edao.addEmployee(emp);
				}
				break;
			case 2:
				System.out.println("-----update Employee-----------------");
				System.out.println("Enter Employee id");
				eid = sc.nextInt();

				System.out.println("Enter name");
				ename = sc.next();

				System.out.println("Enter salary");
				salary = sc.nextDouble();
				emp=new Employee(eid, ename, salary);
				edao.updateEmployee(emp);

				break;
			case 3:
				System.out.println("-----Delete  Employee-----------------");
				System.out.println("Enter Employee id");
				eid = sc.nextInt();
				edao.deleteEmployee(eid);

				break;
			case 4:
				elist = edao.showEmployeeList();
				if (!elist.isEmpty()) {
					System.out.println("--------Employee List--------------");
					for (Employee e : elist) {
						System.out.println(e);
					}
				} else {
					System.out.println("Employee List is Empty");
				}
				break;
			case 5:
				System.out.println("-----Search Employee-----------------");
				System.out.println("Enter Employee id");
				eid = sc.nextInt();

				emp=edao.searchByEmployeeId(eid);
				if(emp!=null)
				{
					System.out.println("Employee is found");
					System.out.println(emp);
				}
				else
				{
					System.out.println("No record of employee Found");
				}
				break;

			}
			System.out.println("do u want to continue??");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

		sc.close();
	}

}
