package com.containtment;

public class Person {
	private String name;
	private String gender;
	private int age;
	private Address addr;
	
	Person()
	{
		
	}

	public Person(String name, String gender, int age, Address addr)
	{	
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}


	public String toString() {
		return "Person " + name + " " + gender + " " + age + " " + addr;
	}
	
	

}
