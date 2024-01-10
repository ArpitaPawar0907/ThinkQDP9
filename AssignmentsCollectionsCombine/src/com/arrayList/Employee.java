package com.arrayList;

public class Employee implements Comparable<Employee> {

	private int eid;
	private String ename;
	private double salary;
	private Department dept;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, double salary, Department dept) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
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
		return "Employee :" + eid + " " + ename + " " + salary+" "+dept;
	}
	@Override
	public int compareTo(Employee e1) {
		
		if(this.ename.equals(e1.ename))
			return  this.eid-e1.eid;
		else
			if(this.ename.compareTo(e1.ename)>0)
				return 1;
			else
				  return -1;
	
	}
	
	
}
