package com.oopsAssignment;

public class Student {
	private int id;
	private String name;
	private double per;
	
	Student()
	{
		
	}
	Student(int id,String name,double per )
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	private void setId(int id)
	{
		this.id=id;
	}
	private int getId()
	{
		return id;
	}
   private void setName(String name)
   {
	   this.name=name;
   }
   public String getName()
   {
	   return name;
   }
   public void setPer(double per)
   {
	   this.per=per;
   }
   public double getPer()
   {
	   return per;
   }
   public String toString()
   {
	   return "Student id:"+id+" Name:"+name+" Percentage:"+per;
   }
   
   
   
   
   
    
}
