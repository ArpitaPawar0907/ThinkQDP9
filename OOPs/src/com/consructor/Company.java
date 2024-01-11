package com.consructor;


class Employee {
	private int eId;
	private String eName;
	private double eSalary;
	
	Employee()
	{
		
	}
	public Employee(int eId,String eName,double eSalary)
	{
		this.eId=eId;
		this.eName=eName;
		this.eSalary=eSalary;
	}
	
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




public class Company {
	public static void main(String[] args) {
		
		Employee e1=new Employee(101,"Prachi",89000);
		Employee e2=new Employee(102,"Reetu",67000);
		
		
		Employee e3=new Employee();
		
		e3.setEId(103);
		e3.setEName("Pooja");
		e3.setESalary(4500);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	}
	  
}





