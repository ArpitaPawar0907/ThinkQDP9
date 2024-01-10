package com.abstractclass;

abstract class Machine
{
	int id;
	String brand;
	
	Machine()
	{
		
	}
	Machine(int id,String brand)
	{
		this.id=id;
		this.brand=brand;
	}
	
	public void rotate()
	{
		System.out.println("Machine id:"+id);
		System.out.println("Brand :"+brand);
		
	}
	public abstract void crush();
	
}

class Juicer extends Machine
{
     String name;
     String model;
     
     
	public Juicer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Juicer(int id, String brand, String name, String model) {
		super(id, brand);
		this.name = name;
		this.model = model;
	}


	@Override
	public void crush() {
		System.out.println("Name:"+name);
		System.out.println("Crusher");
	}
	public void filter()
	{
		System.out.println("Juicer filter");
	}
}

public class Question01
{
	public static void main(String[] args) {
		
		Juicer j1=new Juicer();
		j1.crush();
		j1.filter();
		
		Machine m1=new Juicer(12, "IKON", "Juicer", "ik342");
		m1.crush();
		
		
	}
}
	
	

