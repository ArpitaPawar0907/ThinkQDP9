package com.varargs;

public class VaragrsOverloading {

	public static void display(int ...ar)
	{
		System.out.println("In int");
		for(int a:ar )
		{
			System.out.println(a);
		}
	}
	public static void display(double ...ar)
	{
		System.out.println("In double");
		for( double a:ar )
		{
			System.out.println(a);
		}
	}
	public static void display(String ...ar)
	{
		System.out.println("In string");
		for(String a:ar )
		{
			System.out.println(a);
		}
	}
	public static void displayMe(int x,char...ar)
	{
		System.out.println("In int char");
		System.out.println(x);
		for(char a:ar )
		{
			System.out.println(a);
		}
	}
	public static void displayMe(char x,int ...ar)
	{
		System.out.println("In char int");
		System.out.println(x);
		for(int a:ar )
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		
		display(1,2,3,4);
		display(2.3,4.5,6.5,43.3);
		display("C","C++","java");
		
		displayMe('A',1,2,3);
		displayMe(23,'a','c','d');
                                   //ambiguity
		//displayMe(65,66,67,67);  does not allow type promotion
	}

}
