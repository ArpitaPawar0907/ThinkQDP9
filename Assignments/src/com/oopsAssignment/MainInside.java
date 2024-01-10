package com.oopsAssignment;



public class MainInside {
	int emp_id;
	String emp_name;
     double salary;
	 void getDetails(int a,String n,double s)
	{
		emp_id=a;
		emp_name=n;
		salary=s;
	}
	 void displayDetail()
	 {
		System.out.println("Name of employee: " +emp_name);
		System.out.println("Employee id="+emp_id);
		System.out.println("Salary : "+salary);
	 }
	 
	 public static void main(String args[])
	 {
		 
	MainInside e1=new MainInside();
	e1.getDetails(1, "Abc", 12000.9);
	e1.displayDetail();
	 }


}
