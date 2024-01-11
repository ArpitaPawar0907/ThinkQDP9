package com.inheritance;

class Employee
{
	protected int id;
	private String name;
	private double salary;
	
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
	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

class Manager extends Employee
{
	private int id;
	private float exp;
	private String role;
    Manager()
    {
	
	}
	public Manager(int id,String name,double salary,float exp, String role)
	{
		super(id,name,salary);
		this.exp = exp;
		this.role = role;
	}
	public float getExp() {
		return exp;
	}
	public void setExp(float exp) {
		this.exp = exp;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void display()
	{
		System.out.println("manager:"+id);
		System.out.println("Employ"+super.id);
	}
	public String toString() {
		return "Manager :"+getId()+" "+getName()+" "+getSalary()+" Manager [exp=" + exp + ", role=" + role + "]";
		//return super.toString()+"Manager [exp=" + exp + ", role=" + role + "]";
	}
	
	//we can directly access base class toString method by super keyword
	
	
}



public class SingleInheritance {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"Arpita",24000);
		System.out.println(e1);
        System.out.println("--------------------------------");
		Manager m1=new Manager(101,"Pranali",20000,2,"Deloper");
		
		System.out.println(m1);
		m1.display();

	}

}
