package com.constructor;

public class Account2 {
	public long accountNo;
	public String customerName;
	 
	Account2()
	{
		System.out.println("Default Consrtuctor");
	}
	Account2(long accountNo,String customerName)
	{
		this.accountNo=accountNo;
		this.customerName=customerName;
		System.out.println("I am in Paramerized constructor");
		
	}
     public static void main(String[] args) {
	
    	 Account2 a1=new Account2();
    	 System.out.println("Account No: "+a1.accountNo);
    	 System.out.println("Customer Name: "+a1.customerName);
    	 System.out.println("-----------------------------------");
    	 Account2 a2=new Account2(21345675,"Sonali");
    	 System.out.println("Account No: "+a2.accountNo);
    	 System.out.println("Customer Name: "+a2.customerName);
	
	}
}
