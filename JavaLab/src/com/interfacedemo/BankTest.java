package com.interfacedemo;

  class SavingAccount implements Account
  {
      String hname;
      int accNo;
      double balance;
	public SavingAccount() {
	
	}

	public SavingAccount(String hname, int accNo, double balance) {
		this.hname = hname;
		this.accNo = accNo;
		this.balance = balance;
	}

	@Override
	public void deposite(double amt) {
		balance+=amt;
		System.out.println("Amount dposited:"+amt);
		System.out.println("Balance: "+balance);
	}

	@Override
	public void withdraw(double amt) {
		if((balance-amt)<=0)
		{
			System.out.println("Insufficient balance.......Balance: "+balance);
		}
		else
		{
			balance-=amt;
			System.out.println("Balance:"+balance);
		}
		
		
	}

	@Override
	public void calculateInterest() {
		balance=balance+(0.3*balance);
		System.out.println("Saving Account 30% interest");
		System.out.println("Balance:"+balance);
		
	}

	@Override
	public void viewBalance() {
	
		System.out.println("Account holder:"+hname);
		System.out.println("Account number:"+accNo);
		System.out.println("Balance:"+balance);
		
	}
	   
  }

  class CurrentAccount implements Account
  {
        String hname;
        int accNo;
        double balance;
        public CurrentAccount() {
			
		}
        public CurrentAccount(String hname,int accNo,double balance)
        {
        	this.accNo=accNo;
        	this.hname=hname;
        	this.balance=balance;
        }
     
	@Override
	public void deposite(double amt) {
		
		if((balance+amt)>50000)
		{
			System.out.println("Enter pan no");
		}
		balance+=amt;
		System.out.println("Balance:"+balance);
		
	}

	@Override
	public void withdraw(double amt) {
		
		if((balance-amt)<=1000)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			balance-=amt;
		}
		System.out.println("Balance:"+balance);
		
	}

	@Override
	public void calculateInterest() {
		balance=balance+(0.4*balance);
		System.out.println("Current Account 40 % Interrest");
		System.out.println("Balance:"+balance);
		
	}

	@Override
	public void viewBalance() {
		System.out.println("Balance:"+balance);
		
	}
	   
  }
  
public class BankTest {
	
  
   
	
	

}
