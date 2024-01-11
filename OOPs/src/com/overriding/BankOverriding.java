package com.overriding;

class Account
{
	private int accNo;
	private String name;
	protected double balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
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
	void deposite(float amount)
	{
		balance=balance+amount;
		System.out.println(accNo);
		System.out.println("Account credited by:"+amount);
		System.out.println("New balance "+balance);
	}
	
	void withdraw(float amount)
	{
		if((balance-amount)<0)
		{
			System.out.println("Insfficient balance");
		}
		else
		{
			balance-=amount;
			System.out.println("Account debited by"+amount);
			System.out.println("New balance");
		}
	}
}

class SavingAccount extends Account
{
	private String pan;

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int accNo, String name, double balance, String pan) {
		super(accNo, name, balance);
		this.pan = pan;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}
	void deposite(float amount)
	{
		if((balance+amount)>50000 && pan==null)
		{
			System.out.println("balance exceeds 50000 please enter pan card no");
		}
		else {
		balance=balance+amount;
		System.out.println("Account credited by:"+amount);
		System.out.println("New balance "+balance);
		}
	}

	@Override
	public String toString() {
		return "SavingAccount [pan=" + pan + ", balance=" + balance + ", getAccNo()=" + getAccNo() + ", getName()="
				+ getName() + ", getBalance()=" + getBalance() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
public class BankOverriding {
	Account a1=new Account(123, "Arpita",30000);
	//a1.deposite(30000);
	SavingAccount s1=new SavingAccount(1, "Pranay", 34000);
	
	//s1.deposite(3000f);
	
	
	

}
