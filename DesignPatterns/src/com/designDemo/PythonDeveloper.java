package com.designDemo;

import java.util.Arrays;

public class PythonDeveloper extends Developer{

	public PythonDeveloper() {
		// TODO Auto-generated constructor stub
	}
	
	PythonDeveloper(String name)
	{
		super(name);
	}

	@Override
	public void salaryPaid() {
		salary=55000f;
		
	}

	@Override
	public void skillSet() {
		
		String skills[]= {"Basics Python","Numpy","Machine Learning"};
		System.out.println(Arrays.toString(skills));
		
	}
	
}
