package com.containtment;

public class Department {
	private int did;
	private String dname;

	Department()
	{
		
	}
	Department(int did,String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	
	public void setDid(int did)
	{
		this.did=did;
	}
	public int getDid()
	{
		return did;
	}
	public void setDname(String dname)
	{
		this.dname=dname;
	}
	public String getDname()
	{
		return dname;
	}
	public String toString()
	{
		return "[ Department "+did+" "+dname+"]";
	}
	


}
