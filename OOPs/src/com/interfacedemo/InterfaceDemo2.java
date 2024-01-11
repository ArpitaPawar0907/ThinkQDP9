package com.interfacedemo;
interface Payment
{
	void pay(float amount);
	
}
class Student implements Payment
{ 
	int id;
	String name;
	double qfees;
	public Student() {
		
	}
	

	public Student(int id, String name, double qfees) {
		super();
		this.id = id;
		this.name = name;
		this.qfees = qfees;
	}


	@Override
	public void pay(float amount) {
	 
		double rem=qfees-amount;
		System.out.println("Student id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Paid fees"+amount);
		System.out.println("Remaining fees:"+rem);
		
	}
	
}
class Celebrity implements Payment
{

	String addhar;
	String name;
	double income;
	
	public Celebrity() {
		// TODO Auto-generated constructor stub
	}
	
	public Celebrity(String addhar, String name) {
		super();
		this.addhar = addhar;
		this.name = name;
		
	}

	@Override
	public void pay(float amount) {
       double taxAmount;
       
       System.out.println("Welcome to tax payment:"+name);
       System.out.println("Total earning:"+amount);
       
       if(amount>1000000)
    	   taxAmount=amount*0.3;
       else if(amount>700000)
    	        taxAmount=amount*0.2;
            else if(amount>500000)
	                taxAmount=amount*0.1;
                 else
                	 taxAmount=0;
       
       System.out.println("Tax should be paid:"+taxAmount);
       
       income=amount-taxAmount;
       System.out.println("income after paying tax:"+income);
	}
	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
	
		Payment p;
		p=new Student(1, "Neha", 40000);
		p.pay(23000);
		
		p=new Celebrity("asd23234", "Amithabh Bachan");
		p.pay(900000);

	}

}
