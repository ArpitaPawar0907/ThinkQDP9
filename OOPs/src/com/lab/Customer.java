package com.lab;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private long customerMobileNo;
	private String customerOrder;
	private double customerBill;
	
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
	public void setCustomerAddress(String customerAddress)
	{
		this.customerAddress=customerAddress;
	}
	public String getCustomerAddress()
	{
		return customerAddress;
	}
	public void setCustomerMobileNo(long customerMobileNo)
	{
		this.customerMobileNo=customerMobileNo;
	}
	public long getCustomerMobileNo()
	{
		return customerMobileNo;
	}
	public void setCustomerOrder(String customerOrder)
	{
		this.customerOrder=customerOrder;
	}
	public String getCustomerOrder()
	{
		return customerOrder;
	}
	public void setCustomerBill(double customerBill)
	{
		
	}
	
	
	
	
	
	
	/* public void details(int id,String name,String address,long mobileNo,String order,double bill)
	   {
		 customerId=id;
		 customerName=name;
		 customerAddress=address;
		 customerMobileNo=mobileNo;
		 customerOrder=order;
		 customerBill=bill;
		 
	   }*/
	 public void details(int customerId,String customerName,String customerAddress,long customerMobileNo,String customerOrder,double customerBill)
	   {
		 this.customerId=customerId;
		 this.customerName=customerName;
		 this.customerAddress=customerAddress;
		 this.customerMobileNo=customerMobileNo;
		 this.customerOrder=customerOrder;
		 this.customerBill=customerBill;
		 
	   }
	public void show()
	{
		System.out.println("Customer");
		System.out.println("Id:"+customerId);
		System.out.println("Name :"+customerName);
		System.out.println("Address :"+customerAddress);
		System.out.println("Mobile No:"+customerMobileNo);
		System.out.println("Order:"+customerOrder);
		System.out.println("Bill :"+customerBill);
	}
 /*  public void details()
   {
	   id=1;
	   name="Arpita";
	   address="Pune";
	   mobileNo=12345678;
	   order="Chakan";
	   bill=3456;
   }*/
	
	
	
	
}
