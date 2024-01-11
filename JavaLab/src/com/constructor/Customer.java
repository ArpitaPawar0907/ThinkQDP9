package com.constructor;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerEmail;
	private long contact;
	private String customerPass;
	
	Customer()
	{
		System.out.println("Default Constuctor");
	}
	Customer(int customerId,String customerName,String customerEmail,String customerPass,long contact)
	{
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerEmail=customerEmail;
		this.customerPass=customerPass;
		this.contact=contact;
	}
	
	public void setCustomerId(int customerId)
	{
		this.customerId=customerId;
	}
	public int getCustomerId()
	{
		return customerId;
	}
    public void setCustomerName(String customerName)
    {
    	this.customerName=customerName;
    }
    public String getCustomerName()
    {
    	return customerName;
    }
    public void setCustomerEmail(String customerEmail)
    {
    	this.customerEmail=customerEmail;
    }
    public String getCustomerEmail()
    {
    	return customerEmail;
    }
    public void setContact(long contact)
    {
    	this.contact=contact;
    }
    public long getContact()
    {
    	return contact;
    }
    public void setCustomerPass(String customerPass)
    {
    	this.customerPass=customerPass;
    }
    public String getCustomerPass()
    {
    	return customerPass;
    }
    
    public String toString()
    {
    	return "Customer Id: "+customerId+" \n Name: "+customerName+" \n Email:"+customerEmail+" \n Passsword: "+customerPass+" \n Contact:"+contact;
    }
    
    
    
    
    
}
