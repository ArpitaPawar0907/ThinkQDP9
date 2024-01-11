package com.inhritance;

public class Test {
	
	{
		System.out.println("Instance block1");
	}
	{
		System.out.println("Instance block 2");
	}
	static 
	{
		System.out.println("Static 1");
	}
	static
	{
		System.out.println("Static 2");
	}
	
	public static void main(String[] args) {
		
		new Test();
	}

}
