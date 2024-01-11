package com.consructor;

public class Account {
	
	private int aid;
	private String aname;
	private String aholder;
	private double balance;
	
    public Account()
	{
		
	}
   public Account(int aid,String aname,String aholder,double balance)
   {
	   this.aid=aid;
	   this.aname=aname;
	   this.aholder=aholder;
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
   public void setAholder(String aholder)
   {
	   this.aholder=aholder;
   }
   public String getAholder()
   {
	   return aholder;
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
	   return aid+"  "+aname+" "+aholder+" "+balance;
   }
   public void withdraw(int amount)
   {
	   
	   if((getBalance()-amount)<getBalance())
	   {
		   System.out.println("Insufficent balance: "+getBalance());
	   }
	   else
	   {
		   setBalance(getBalance()-amount);
		   System.out.println("Current balance: "+getBalance());
	   }
	   
	   
   }
   
   public void deposite(int amount)
   {
	   setBalance(getBalance()+amount);
	   System.out.println("Current Balance: "+getBalance());
	   
   }
   
   
   public static void main(String[] args) {
	
	   Account a1=new Account(101,"Saving","Rani",50000);
	   Account a2=new Account();
	   
	   a2.setAid(102);
	   a2.setAname("Saving");
	   a2.setAholder("Arpita");
	   a2.setBalance(45678);
	   
	   System.out.println(a1);
	   System.out.println(a2);
	   
	   
	   a1.deposite(3000);
	   System.out.println(a1);
	   System.out.println("------------------------------");
	   a2.withdraw(2344);
}
   
   
}
