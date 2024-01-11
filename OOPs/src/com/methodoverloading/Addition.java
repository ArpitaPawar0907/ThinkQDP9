package com.methodoverloading;

public class Addition {
	final void add(int num1,int num2)
	{
		System.out.println("Addtion of int"+(num1+num2));
	}
	void add(float num1,float num2)
	{
		System.out.println("Float addition"+(num1+num2));
		
	}
	void add(int num1,float num2)
	{
		System.out.println(" int Float addition"+(num1+num2));
		
	}
	
	
public static void main(String[] args) {
	Addition a1=new Addition();
	
	a1.add(12, 23);
	a1.add(12.3f,34f);
	a1.add(23, 56f);
}
}
