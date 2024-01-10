package com.oopsmehods;



public class Account {
	
	private int aid;
	private String aname;
	
	private double balance;
	
	public Account()
	{
		
	}
   public Account(int aid,String aname,double balance)
   {
	   this.aid=aid;
	   this.aname=aname;
	   
	   this.balance=balance;
   }
   
   public void setAid(int aid)
   {
	   this.aid=aid;
   }
   public int getAid()
   {
	   return aid;
   }
   public void setAname(String aname)
   {
	   this.aname=aname;
   }
   public String getAname()
   {
	   return aname;
   }
    public void setBalance(double balance)
   {
	   this.balance=balance;
   }
   public double getBalance()
   {
	   return balance;
   }
   public String toString()
   {
	   return aid+"  "+aname+"  "+balance;
   }
   
   
   
   
   
}

