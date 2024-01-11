package com.containment;

public class Company {

	public static void main(String[] args) {
		
		Department d1=new Department(101,"Office Staff");
		Department d2=new Department(102,"Programming ");
		Department d3=new Department(103,"Testing");
		
		Employee e1=new Employee(1,"Arpita",d1);
		Employee e2=new Employee(2,"Sonali",d2);
		Employee e3=new Employee(3,"reetu",d3);
		
      
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		Employee e4=new Employee(4,"Pooja",new Department(104,"R&D"));
		
		System.out.println(e4);
	
	Department d4=new Department();
	d4.setDid(105);
	d4.setDname("PR");
	
	Employee e=new Employee();
	e.setEid(5);
	e.setEname("Pranali");
	e.setDepartment(d4);
	
	System.out.println(e);
	
	Employee e6=new Employee();
	e6.setEid(6);
	e6.setEname("Pranay");
	e6.setDepartment(new Department());
    e6.getDepartment().setDid(106);
    e6.getDepartment().setDname("Comp");
    System.out.println(e6);
	
	
	
	
	}
	
	
	

}
