package com.methodoverriding;


class Company
{   String add;
	Company(String add)
	{
		this.add=add;
	}
	
	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public void address()
	{
		System.out.println("Address of Company"+add);
	}
}
class Ebay extends Company{
	String eadd;
	Ebay(String add,String eadd)
	{
		super(add);
		this.eadd=eadd;
	}
	
	public String getEadd() {
		return eadd;
	}

	public void setEadd(String eadd) {
		this.eadd = eadd;
	}

	public void address()
	{
		System.out.println("Address of Ebay "+eadd);
	}
}
public class CompanyTest {

	public static void main(String[] args) {
		
		Ebay e1=new Ebay("Pune","Pimpri");
		e1.address();

	}

}
