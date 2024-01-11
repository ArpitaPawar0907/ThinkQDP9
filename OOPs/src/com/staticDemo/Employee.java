package com.staticDemo;

public class Employee {
	private int eid;
	private String ename;
	private double salary;
	static int empCount;
	//static String companyName;
	//static String companyName="HCl";
	 private static String companyName;
	static
	{
		companyName="Hcl";
	}
	 {
		 System.out.println("instance block");
	//	 companyName="Hcl";
		 empCount++;
	 }
	 Employee() 
	 {
		 System.out.println("Default constructor");
		 
	/// companyName="hcl";
	}
	Employee(int eid,String ename,double salary)
	{
		this();
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		
	}
	public void setEid(int eid)
	{
	this.eid=eid;	
	}
	public int getEid()
	{
		return eid;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public String getEname()
	{
		return ename;
	}
	public void setSalary(double salary) 
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public static void setCompanyName(String companyName) 
	{
		Employee.companyName = companyName;
	}
	public static String getCompanyName()
	{
		return companyName;
	}
	
	public String toString()
	{
		return "id:"+eid+" name:"+ename+" salary:"+salary+" Company Name"+companyName;
	}

}
