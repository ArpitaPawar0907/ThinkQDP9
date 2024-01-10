package com.staticandfinalkeyword;



public class Company {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		System.out.println(e1);
		System.out.println("---------------------------------");
		Employee e2=new Employee(102,"Arpita",23000);
		System.out.println(e2);
		System.out.println("---------------------------------");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println("------------------------------------");
        System.out.println("Employee count:"+Employee.empCount);
		
		



	}

}
