package com.linkedlist;

public class Employee implements Comparable<Employee>{
  
	private int id;
	private String name;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee e2) {
		if(this.getSalary()==e2.getSalary())
			return this.getName().compareTo(e2.getName());
		else
			if(this.getSalary()<e2.getSalary())
              return -1;
			else
				return 1;
		}
	


}
