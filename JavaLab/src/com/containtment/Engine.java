package com.containtment;

public class Engine {
	private String etype;
	
	Engine()
	{
		
	}
	Engine(String etype)
	{
		this.etype=etype;
	}
	public void setEtype(String etype)
	{
		this.etype=etype;
	}
	public String getEtype()
	{
		return etype;
	}
	public String toString()
	{
		return "Engine Type:"+etype;
	}
	
	
	
}
