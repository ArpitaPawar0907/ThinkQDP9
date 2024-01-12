package com.designDemo;

public class GetDeveloper {
	
	public Developer getDeveloper(String type)
	{
		if(type==null)
			return null;

		else if(type.equalsIgnoreCase("java"))
			return new JavaDeveloper();
		else if(type.equalsIgnoreCase("python"))
			return new PythonDeveloper();
		else if(type.equalsIgnoreCase("fullstack"))
			return new FullStackDeveloper();
		else
		return null;
	}
}