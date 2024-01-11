package com.interfacedemo;

public class Bank {

	public static void main(String[] args) {
	
		SavingAccount s1=new SavingAccount("Arpita",1234,20000);
		  CurrentAccount c1=new CurrentAccount("Pooja",6543,30000);
		  
		  s1.deposite(3443);
		  s1.withdraw(4500);
		  s1.calculateInterest();
		  s1.viewBalance();
		 
		  
		  c1.deposite(4000);
		  c1.withdraw(45000);
		  c1.calculateInterest();
		  c1.viewBalance();
		 
		  

	}

}
