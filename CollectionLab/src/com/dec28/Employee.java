package com.dec28;

public class Employee {
	
	private int eid;
    private String ename;
    private int deptid;
    private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename,int deptid, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.deptid=deptid;
		this.salary = salary;
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
	@Override
	public String toString() {
		return "Employee " + eid + " " + ename + " " + deptid + " " + salary;
	}
    

}
