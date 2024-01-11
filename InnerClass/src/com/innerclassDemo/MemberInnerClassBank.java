package com.innerclassDemo;

import com.innerclassDemo.Bank.Locker;

class Bank
{
	private static String bname="SBI bank";
	static String loc;
	static String ifsc;
	int accNo;
	String aname;
	double balance;
	static
	{
		loc="Delhi";
		ifsc="SBD235";
	}
	
	public Bank() {
		
	}

	public Bank(int accNo, String aname,double balance) {
		this.accNo = accNo;
		this.aname = aname;
		this.balance=balance;
	}
	
	void displayBankDetails()
	{
		System.out.println(bname+" "+loc);
		System.out.println(ifsc);
	}
	
	class Locker
	{
		int locNo;
		String pass;
		 double rent =2000;
		public Locker() {
			
		}
		public Locker(int locNo, String pass) {
			this.locNo = locNo;
			this.pass = pass;
		}
		void displayLockerDetails()
		{
			displayBankDetails();
		     System.out.println("Locker no"+locNo);
		     System.out.println("Password:"+pass);
		     System.out.println("Rent:"+rent);
		}
	}
}
public class MemberInnerClassBank {

	public static void main(String[] args) {
		
		Bank cust1=new Bank(1234,"Arpita",34000 );
		cust1.displayBankDetails();
		
		Bank.Locker loc=cust1.new Locker(1343, "Me@122");
		loc.displayLockerDetails();
		
		Locker locker=new Bank(1232, "Reetu", 20000).new Locker(12, "Rani@123");
		locker.displayLockerDetails();
		

	}

}
