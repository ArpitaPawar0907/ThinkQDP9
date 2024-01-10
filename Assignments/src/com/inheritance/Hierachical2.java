package com.inheritance;
class Bank {
	   int accNo;
			float amount;
		Bank()
		{
			
		}
		Bank(int accNo,float amount)
		{
			this.accNo=accNo;
			this.amount=amount;
		}
		public void calInterest()
		{
		amount=amount+(amount*0.02f);	
		}


}
class CurrentAccount extends Bank
{
	CurrentAccount(int accNo,float amount)
	{
		super(accNo,amount);
		
	}
	public void calInterest()
	{
		 amount=amount+(amount*0.05f);
	System.out.println(amount);
	}
}

class SavingAccount extends Bank
{
	SavingAccount(int accNo,float amount)
	{
		super(accNo,amount);
		
	}
	public void calInterest()
	{
		 amount=amount+(amount*0.03f);
	System.out.println(amount);
	}
	
}



public class Hierachical2 {

	public static void main(String[] args) {
	
		Bank b1;
		b1=new SavingAccount(12321,10000f);
		b1.calInterest();
		b1=new CurrentAccount(4322,10000);
		b1.calInterest();
		

	}

}
