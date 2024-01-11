package com.inhritance;

public class Test2 {
	
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
	Test2()
	{
		System.out.println("Constructor default");
	}
	Test2(int i)
	{
		System.out.println("paramer value"+i);
	}
	public static void main(String[] args) {
		
		new Test2();
		new Test2(4);
	}

}
