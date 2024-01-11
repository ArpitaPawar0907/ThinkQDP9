package com.methodoverloading;
/*
 * yes we can overload static method
 */
public class StaticOverloading {
	static void display()
	{
		System.out.println("Hi");
	}
	static void display(String msg)
	{
		System.out.println(msg);
	}
	static void display(int num)
	{
		System.out.println(num);
	}

	public static void main(String[] args) {
	
		display();
		display(3);
		display("JAVA");

	}

}
