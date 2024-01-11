package com.containtment;

public class Car {
	private int cid;
	private String cname;
	private Engine engine;
	Car()
	{
		
	}
    Car(int cid,String cname,Engine engine)
    {
    	this.cid=cid;
    	this.cname=cname;
    	this.engine=engine;
    }
    public void setCid(int cid)
    {
    	this.cid=cid;
    }
    public int getCid()
    {
    	return cid;
    }
    public void setCname(String cname)
    {
    	this.cname=cname;
    }
    public String getCname()
    {
    	return cname;
    }
    public void setEngine(Engine engine)
    {
    	this.engine=engine;
    }
    public Engine getEngine()
    {
    	return engine;
    }
    public String toString() {
    	return "Car: "+cid+"  "+cname+"  "+engine;
    }
    
    
}
