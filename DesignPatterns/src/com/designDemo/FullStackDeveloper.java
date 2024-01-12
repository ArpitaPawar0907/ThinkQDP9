package com.designDemo;

import java.util.Arrays;

public class FullStackDeveloper extends Developer{

	public FullStackDeveloper() {
		// TODO Auto-generated constructor stub
	}
	
	FullStackDeveloper(String name)
	{
		super(name);
	}

	@Override
	public void salaryPaid() {
		salary=75000f;
		
	}

	@Override
	public void skillSet() {
		
		String skills[]= {"core java ,angular"};
		System.out.println(Arrays.toString(skills));
		
	}
	
}
