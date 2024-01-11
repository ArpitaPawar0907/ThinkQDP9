package com.exception;

public class OutPut{
	static void foo(int i)
	{
		System.out.println(1);
	}
	static void foo(Number i)
	{
		System.out.println(2);
	}
	static void foo(double i)
	{
		System.out.println(3);
	}
	static void foo(Long i)
	{
		System.out.println(4);
	}
	public static void main(String[] args) {
		
		Long num=90l;
		foo(num);
		
	}
 
}
