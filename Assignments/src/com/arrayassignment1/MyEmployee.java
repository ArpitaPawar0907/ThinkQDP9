package com.arrayassignment1;

public class MyEmployee {
	
	private int id;
	private String name;
	private double salary;
	private Date date;
	private Department dept;
	public MyEmployee() {
	
	}
	public MyEmployee(int id, String name, double salary,Date date,Department dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date=date;
		this.dept=dept;
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
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [" + id + " " + name + " " + salary +" "+date+"  " +dept+ "]";
	}
	
	

}
