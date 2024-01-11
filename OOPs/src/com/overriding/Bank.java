package com.overriding;

public class Bank {

	public static void main(String[] args) {
		
		Account a1=new Account(123, "Arpita", 30000);
		
		System.out.println(a1);
		a1.deposite(30000);
        SavingAccount s1=new SavingAccount(1230, "Pranay",25000);
        System.out.println(s1);
        s1.deposite(32000);
	}

}
