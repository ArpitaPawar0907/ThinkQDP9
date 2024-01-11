package com.ternary;

public class TernaryDemo {

	public static void main(String[] args) {
	  
		int age=13;
		if(age>=18)
			System.out.println("can vote");
		else
			System.out.println("cannot vote");
		
		boolean status=age>=18?true:false;
		System.out.println(status);
		System.out.println(age>=18?" Vote ":"Cannot Vote");
		int n=34;
		System.out.println(n%2==0?"Even":"Odd");

	}

}
