package com.staticandfinalkeyword;

public class Employee {
	private int id;
	private String name;
	private double salary;
	static int empCount=0;
	Employee()
	{
		
	}
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static int getEmpCount() {
		return empCount;
	}
	public static void setEmpCount(int empCount) {
		Employee.empCount = empCount;
	}

	
	public String toString() {
		return "id:" + id + " name:" + name + " salary:" + salary ;
	}
	

}
