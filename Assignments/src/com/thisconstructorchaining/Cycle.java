package com.thisconstructorchaining;

public class Cycle {
	private int accNo;
	private int noOfWheels;
	Cycle()
	{
		System.out.println("i am in default constructor");
	}
	Cycle(int accNo,int noOfWheels)
	{
		this();
		System.out.println("i am in another constructor");
		this.accNo=accNo;
		this.noOfWheels=noOfWheels;
	}
	public int getAccNo() 
	{
		return accNo;
	}
	public void setAccNo(int accNo)
	
	{
		this.accNo = accNo;
	}
	public int getNoOfWheels()
	{
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) 
	{
		this.noOfWheels = noOfWheels;
	}
	
	public String toString() {
		return "accNo:" + accNo + " noOfWheels:" + noOfWheels;
	}
	
	
}
