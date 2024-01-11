package com.overriding;

class Developer
{
	final String ename;
	float salary;
	final static String companyName;
	final static int noOfHour=8;
	final String panNo;
	static
	{
		companyName="ThinkQ";
	}
	public Developer() {
		
		ename="Unknown";
		panNo="Unknown";
	}
	
	
	public Developer(String ename, float salary, String panNo) 
	{
		this.ename = ename;                                                                 
		this.salary = salary;
		this.panNo = panNo;
	}
    

	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getEname() {
		return ename;
	}


	public static String getCompanyname() {           
		return companyName;
	}


	public static int getNoofhour() {
		return noOfHour;
	}


	public String getPanNo() {
		return panNo;
	}


	final void skillset()
	{
		System.out.println("java,html,c++");
	}
}
class FullStackDeveloper extends Developer
{
//	final void skillset()
//	{
//		System.out.println("java,html,c++");
//	}
}
public class FinalDemo {

	public static void main(String[] args) {
		Developer d1=new Developer("Reetu", 24000,"ACD453FD");
		System.out.println(d1);
		
		
	//	d1.setEname("Reetu Rani");
	//	d1.setPan("SDSF976S");
	//	Developer.noOfHour=9;
    //we cannot call change value of final variables
		//we cannot override final methods
		// we cannot inherit final class.
	}

}
