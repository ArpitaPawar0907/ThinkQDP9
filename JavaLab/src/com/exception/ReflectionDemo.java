package com.exception;

public class ReflectionDemo {
     
	private String s;
	public ReflectionDemo() {
		s="Reflection example";
	}
	public void method1()
	{
		System.out.println("String is "+s);
	}
	public void method2(int n) {
		System.out.println("The number is"+n);
	}
	private String method3()
	{
		
	System.out.println("Private method invoked");
	return s;
	}
public static void main(String[] args) {
	ReflectionDemo d1=new ReflectionDemo();
	d1.method1();
	d1.method2(23);
     System.out.println(d1.method3());
}
	
}
