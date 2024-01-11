package com.inhritance;


class Country {
	String conName;
	
	public Country() {
		}

	public Country(String conName) 
	{
		
		this.conName = conName;
	}

	public String getConName() 
	{
		return conName;
	}

	public void setConName(String conName) 
	{
		this.conName = conName;
	}

	
	public String toString() 
	{
		return "Country Name :"+conName;
	}

	
	

}

public class State extends Country {
	String stateName;
	State()
	{
		
	}
	State(String conName,String stateName)
	{
		super(conName);           //to call parent class constructor
		this.stateName=stateName;
	}

	public String getStateName()
	{
		return stateName;
	}

	public void setStateName(String stateName)
	{
		this.stateName = stateName;
	}


	public String toString()
	{
		return super.toString()+"State Name"+stateName;   //to call parent class method
	}
	public void display()
	{
		System.out.println("Country name +"+super.conName);//to call parent class variable
	}
	

}



