package com.inheritance;

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

class State extends Country {
	String stateName;
	State()
	{
		
	}
	State(String conName,String stateName)
	{
		super(conName);
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
		return super.toString()+"State Name"+stateName;
	}
	
	

}

class City extends State{
	 
	String city;
	int pin;
    City()
	{
		
	}
	City(String conName,String stateName,String city,int pin)
	{
		super(conName,stateName);
		this.city=city;
		this.pin=pin;
		
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

	public String toString() {
		return super.toString()+"City :"+city+" PinCode : "+pin;
	}
	

}


public class Multilevel1 {

	public static void main(String[] args) {
		
		City c1=new City("India","Maharastra","Chakan",410501);
		System.out.println(c1);

	}

}
