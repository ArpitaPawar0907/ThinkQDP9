package com.lab;

public class Employee implements  Comparable<Employee> {
	
	private int eid;
	private String ename;
	private double salary;
	private Department dept;
	
	Employee()
	{
		
	}
	Employee(int eid,String ename,double salary,Department dept)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		this.dept=dept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee " + eid + " " + ename + " " + salary + " " + dept;
	}
	@Override
	public int compareTo(Employee e1) {
		
		if(this.dept.getDname().equals(e1.dept.getDname()))
		{
			if(this.salary==e1.salary)
				return 0;
			else if(this.salary<e1.salary)
			return -1;
			else
			return 1;
		
		}
		else if(this.dept.getDname().compareTo(e1.dept.getDname())<0)
			return -1;
		else
			return 1;
	}
	
//	public int compareTo(Employee e1) {   //name
//	
//		return (this.id-e1.id);  
//	
//	}

//	@Override
//	public int compareTo(Employee e1) {   //name
//	
//		return (this.ename.compareTo(e1.ename));  
//	
//	}

//	public int compareTo(Employee e1) {  //salary
//		if(this.salary==e1.salary)
//			return 0;
//		else if(this.salary<e1.salary)
//		return -1;
//		else
//			return 1;
//	
//	}


}
