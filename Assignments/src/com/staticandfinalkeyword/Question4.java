package com.staticandfinalkeyword;

public class Question4 {
	int a=1;
	static int b=1;
	static
	{
		b=3;
		//a=4;  we cannot access not static variable in static block
	}
	public static void show()
	{
		b=5;
		//a=4; we cannot access non static variable in method
	}
	void display()
	{
		b=6;
		a=6; 
	}
	

}
