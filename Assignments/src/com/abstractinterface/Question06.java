package com.abstractinterface;
class MyEmployee
{
	private int id;
	private String name;
	private int hourhowork;
	double salary;
	public MyEmployee() {
		// TODO Auto-generated constructor stub
	}
	public MyEmployee(int id, String name, int hourhowork) {
		this.id = id;
		this.name = name;
		this.hourhowork = hourhowork;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHourhowork() {
		return hourhowork;
	}
	public void setHourhowork(int hourhowork) {
		this.hourhowork = hourhowork;
	}
	@Override
	public String toString() {
		return "MyEmployee [id=" + id + ", name=" + name + ", hourhowork=" + hourhowork + "]";
	}
	public void fullTime()
	{
		salary=hourhowork*500;
		System.out.println("Salary of full time employ:"+salary);
		
	}
	public void partTime()
	{
		salary=hourhowork*200;
		System.out.println("Salary of full time employ:"+salary);
		
	}
	
}
class Company
{
	private String comName;
	private MyEmployee employ;
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public Company(String comName, MyEmployee employ) {
		this.comName = comName;
		this.employ = employ;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public MyEmployee getEmploy() {
		return employ;
	}
	public void setEmploy(MyEmployee employ) {
		this.employ = employ;
	}
	@Override
	public String toString() {
		return "Company [comName=" + comName + ", employ=" + employ + "]";
	}
	
	
	
}
public class Question06 {

	public static void main(String[] args) {
		
		MyEmployee e1=new MyEmployee(101,"Sonali", 8);
		MyEmployee e2=new MyEmployee(103,"Radha",4);
		
		Company c1=new Company("TATA", e1);
		Company c2=new Company("IBM", e2);
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.getEmploy().fullTime();
		c2.getEmploy().partTime();

	}

}
