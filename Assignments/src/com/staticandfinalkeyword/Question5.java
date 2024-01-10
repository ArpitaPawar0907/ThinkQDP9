package com.staticandfinalkeyword;

public class Question5 {
	
	public static void add(int a,int b)
	{
		System.out.println("Integet addition");
		System.out.println("Addition :"+(a+b));
	}
	
	public static void add(float a,float b)
	{
		System.out.println("Float addition");
		System.out.println("Addition :"+(a+b));
	}
	public  void add(double a,double b)
	{
		System.out.println("Double addition");
		System.out.println("Addition :"+(a+b));
	}
/*	public static void add(double a,double b)
	{
		System.out.println("Addition"+(a+b));
	}
*/
	public static void main(String[] args) {
		
		Question5 q5=new Question5();
		add(3,5);
		add(12f,4.5f);
		q5.add(345,564.4);
	}
	
	
	
	
}
