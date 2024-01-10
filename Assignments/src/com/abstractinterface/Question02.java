package com.abstractinterface;
 abstract class WiFi
{
	protected String name;
	protected String pass;
	public WiFi() {
		// TODO Auto-generated constructor stub
	}
	public WiFi(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}
	abstract void display();
	
}
class Employee extends WiFi
{
	int id;
	String name;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String pass, int id, String name2) {
		super(name, pass);
		this.id = id;
		name = name2;
	}
	
	@Override
	void display() {

		System.out.println("Name:"+name);
        System.out.println("Password:"+pass);
        System.out.println("id:"+id);
        System.out.println("Employee name:"+name);

	}
	
}

public class Question02 {

	public static void main(String[] args) {
		
		Employee e1=new Employee("ANDROIDA21", "glibd234d",2,"Anisha");
		
		e1.display();

	}

}
