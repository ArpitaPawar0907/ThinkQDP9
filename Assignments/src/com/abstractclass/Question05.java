package com.abstractclass;

abstract class Person
{
	int id;
	String name;
	
	public Person() {
		
	
	}

	public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	abstract void cook();
	
	void wash()
	{
		System.out.println("Person washes cloths");
	}
}
class Chef extends Person
{
	String address;
	
     public Chef() {
		super();
		// TODO Auto-generated constructor stub
	}

     public Chef(int id, String name, String address) {
 		super(id, name);
 		this.address = address;
 	}

	@Override
	void cook() {
		System.out.println("id"+id);
		System.out.println("name"+name);
		System.out.println("Address:"+address);
		System.out.println("chef cooks");
		
	}
	
}
public class Question05 {

	public static void main(String[] args) {
		  
		Person p;
		p=new Chef(12,"Riya","Pune");
		
		p.cook();

	}

}
