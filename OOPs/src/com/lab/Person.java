package com.lab;

public class Person {

	String name="Sonali";
	int age=23;

	public static void main(String[] args) {
		
		Person p1=new Person();
		//System.out.println(p1.name);
		p1.name="Arpita";
		p1.age=25;
		System.out.println(p1.name+" "+p1.age);
		Person p2=new Person();
		System.out.println(p2.name+"   "+p2.age);

	}

}
