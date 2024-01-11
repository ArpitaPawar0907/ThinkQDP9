package com.customexception;

class Account
{
	private int accid;
	private String name;
	private double balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int accid, String name, double balance) {
		this.accid = accid;
		this.name = name;
		this.balance = balance;
	}
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void deposite(double amount)
	{
		balance+=amount;
		System.out.println("Amount deposited :"+amount);
		System.out.println("New Balance :"+balance);
	}
	void withdraw(double amount)
	{
		try
		{
			if((balance-amount)<0)
				throw new InsufficientBalanceException("Your balance is low :"+balance);
			
			balance-=amount;
			System.out.println("Amount withdrawn :"+amount);
			System.out.println("New Balance :"+balance);

		}catch (Exception e) {
			System.out.println(e);
		}
	}
	@Override
	public String toString() {
		return "Account [accid=" + accid + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
public class Bank {

	public static void main(String[] args) {
		
		Account a1=new Account(101, "Reetu", 2000);
		a1.deposite(2000);
		System.out.println("-----------------------");
		a1.withdraw(5000);
		System.out.println("-----------------------");
		a1.deposite(2000);
		System.out.println("-----------------------");
		a1.withdraw(5000);
	}
}
