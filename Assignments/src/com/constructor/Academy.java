package com.constructor;

public class Academy {

	private int id;
	private String name;
	private String course;
	private double fees;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	
	
	public void setCourse(String course) 
	{
		this.course = course;
	}
	public String getCourse()
	{
		return course;
	}
	
	public void setFees(double fees)
	{
		this.fees = fees;
	}
	public double getFees()
	{
		return fees;
	}
	
	
	
}
