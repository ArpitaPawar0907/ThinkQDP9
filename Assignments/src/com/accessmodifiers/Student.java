package com.accessmodifiers;

public class Student {
	private int rollNo;
	protected long addmissionNo;
	public int age;
	public int getRollNo() 
	{
		return rollNo;
	}
	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}
	public long getAddmissionNo()
	{
		return addmissionNo;
	}
	public void setAddmissionNo(long addmissionNo)
	{
		this.addmissionNo = addmissionNo;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	
     
}
