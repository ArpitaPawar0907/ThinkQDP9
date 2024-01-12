package com.designDemo;

public abstract class Developer {

	String name;
	float salary;
	int noOfHour;
	public Developer() {
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Developer(String name) {
		this.name = name;
	}
	
	abstract void salaryPaid();
	abstract void skillSet();
	
	public void workingHours()
	{
		noOfHour=8;
	}
}
