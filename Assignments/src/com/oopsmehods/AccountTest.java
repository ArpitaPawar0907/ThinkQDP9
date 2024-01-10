package com.oopsmehods;

import java.util.Scanner;

public class AccountTest {
	static Scanner sc=new Scanner(System.in);
	
	public static void insert(Account a)
	{
		System.out.println("Enter account id");
		a.setAid(sc.nextInt());
		
		System.out.println("Enter account name");
		a.setAname(sc.next());
		
		System.out.println("Enter account balance");
		a.setBalance(sc.nextDouble());
	}
	
	public static void deposite(Account a)
	{
           System.out.println("Enter amount to be deposited");
           int amount=sc.nextInt();
		   a.setBalance(a.getBalance()+amount);
		   System.out.println("Current Balance: "+a.getBalance());
		
	}
	
	public static void withdraw(Account a)
	{
		System.out.println("Enter amount to be withdrawn");
        int amount=sc.nextInt();
		 if((a.getBalance()-amount)<a.getBalance())
		   {
			   System.out.println("Insufficent balance: "+a.getBalance());
		   }
		   else
		   {
			   a.setBalance(a.getBalance()-amount);
			   System.out.println("Current balance: "+a.getBalance());
		   }
	}
	
	public static void display(Account a)
	{
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		  
		   Account a1=new Account();
		   
		   insert(a1);
		   deposite(a1);
		   withdraw(a1);
		   display(a1);
	}

}
