package com.oopsAssignment;


public class Employ {
	int emp_id;
	String emp_name;
	float exp;
     double salary;
	 void getDetails(int a,String n,float e,float s)
	{
		emp_id=a;
		emp_name=n;
		exp=e;
		salary=s;
	}
	 void displayDetail()
	 {
		System.out.println("Name of employee : " +emp_name);
		System.out.println("Employee id : "+emp_id);
		System.out.println("Experiance : "+exp);
		System.out.println("Salary : "+salary);
	 }

}

