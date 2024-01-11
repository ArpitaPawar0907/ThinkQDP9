package com.consructor;

public class Employee1 {
	private int eId;
	private String eName;
	private double eSalary;
	
	
	public void setEId(int eId)
	{
		this.eId=eId;
	}
   public int getEId()
   {
	   return eId;
   }
   public void setEName(String eName)
   {
	   this.eName=eName;
   }
   public String getEName()
   {
	   return eName;
   }
   public void setESalary(double eSalary)
   {
	   this.eSalary=eSalary;
   }
   public double getESalary()
   {
	   return eSalary;
   }
   public String toString()
   {
	   return eId+" "+eName+" "+eSalary;
   }
   
}





