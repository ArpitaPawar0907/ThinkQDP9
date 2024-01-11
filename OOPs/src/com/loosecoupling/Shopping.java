package com.loosecoupling;

interface Payment
{
	public boolean doPayment(double amount);
}
class Creditcard implements Payment
{
	private int cardNo;
	private int cvv;
	private double limit;
	public Creditcard() {
		// TODO Auto-generated constructor stub
	}
	public Creditcard(int cardNo, int cvv, double limit) {
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.limit = limit;
	}
	
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	@Override
	public boolean doPayment(double amount) {
		if(limit-amount>=0)
		{
			System.out.println("Amount paid:"+amount);
			limit-=amount;
			return true;
		}
		else
		{
			System.out.println("Overlimited ,,,,,,,,,,Limit:"+limit);
			return false;
		}
		
	}
	
}

class DebitCard implements Payment
{
	private int cardNo;
	private double balace;
	public DebitCard() {
		
	}
	public DebitCard(int cardNo, double balace) {
		this.cardNo = cardNo;
		this.balace = balace;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public double getBalace() {
		return balace;
	}
	public void setBalace(double balace) {
		this.balace = balace;
	}
	@Override
	public boolean doPayment(double amount) {
		
		if((balace-amount)>=1000)
		{
		    System.out.println("Amount paid:"+amount);
		    balace-=amount;
		    return true;
		}
		else 
		{
			System.out.println("Insufficient amount ,,,"+balace );
			return false;
		}
		
	}
	
	
	
}


public class Shopping {
	
	String name;
	long mobileno;
	double bill;
	

	
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public Shopping(String name, long mobileno) {
		this.name = name;
		this.mobileno = mobileno;
	}
    public void payment(Payment p,double amt)
    {
    	if(p.doPayment(amt))
    	{
    		this.bill-=amt;
    	}
    	System.out.println("Bill to be paid:"+this.bill);
    	
    }
    public void payment(Payment p,double amt,double discount)
    {
    	double total=amt;
    	amt=amt-(discount/100)*amt;
    	if(p.doPayment(amt))
    			{
    		      this.bill-=total;
    			}
    	System.out.println("Bill to be paid:"+this.bill);
    }
    
    	
    

	public static void main(String[] args) {
		
		Shopping s1=new Shopping("Arpita",05654665);
		
		Payment p;
		Creditcard c1=new Creditcard(123, 566, 40000);
		DebitCard d1=new DebitCard(1322, 50000);
		s1.setBill(70000);
		System.out.println("Total bill:"+s1.bill);
		
		s1.payment(c1, 40000);
		System.out.println("----------------------------------");
		
		s1.payment(d1, 20000, 10);
		System.out.println("-----------------------------------");
		s1.payment(c1, 10000);
		System.out.println("------------------------------------");
		s1.payment(d1, 10000, 10);
		System.out.println("-----------------------------------");

	}

}
