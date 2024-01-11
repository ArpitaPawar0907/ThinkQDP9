package com.covarient;

class Person
{
	int id;
	String name;
	Person()
	{
		
	}
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Person showDetails()
	{
		name+=" ThinkQ";
		return this;
	}
	public String toString()
	{
		return "id:"+id+" name:"+name;
	}
}

class Employee extends Person
{
	
	float salary;
	Employee()
	{
		
	}
	Employee(int id,String name,float salary)
	{
		super(id,name);
		this.salary=salary;
	}
	Person showDetails()
	{
		name+=" ThinkQuetient";
		salary+=1000;
		return this;
	}
	void showSalary()
	{
	System.out.println("Salary:"+salary);
	}
}
public class CovarientDemo {

	public static void main(String[] args) {
	
		Person p;
		Employee e;
		
		Person p1=new Person(1,"Shreyash");
		Person p2=new Person(2,"Prachi");
		
		Employee e1=new Employee(3, "Pranay", 34665f);
		
		p=p1.showDetails();
		System.out.println(p);
		
		p=p2.showDetails();
		System.out.println(p);
		
		p=e1.showDetails();
		System.out.println(p);
		
	//	p.showSalary();
		e=(Employee) e1.showDetails();// we need explicite type casting
		System.out.println(e);
		
		e.showSalary();
		System.out.println(e);
		
	

	}

}
