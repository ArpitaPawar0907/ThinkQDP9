package com.designDemo;

import java.util.Arrays;

public class JavaDeveloper extends Developer{

	public JavaDeveloper() {
		// TODO Auto-generated constructor stub
	}
	
	JavaDeveloper(String name)
	{
		super(name);
	}

	@Override
	public void salaryPaid() {
		salary=75000f;
		
	}

	@Override
	public void skillSet() {
		
		String skills[]= {"Oops,SQL"};
		System.out.println(Arrays.toString(skills));
		
	}
	
}
