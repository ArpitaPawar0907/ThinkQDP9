package com.methodOverriding;

import java.io.IOException;

class Parent1
{
	int data=10;
	//  throwing an  checked exception
   void method1() throws IOException
   {
	   System.out.println(data);
	   throw new IOException();
   }
   //throwing an checked exception
   void method2() throws Exception
   {
	   System.out.println(data/0);
	   throw new Exception();
   }
}
class Child1 extends Parent1
{
	//any unchecked ,same checked and its child class
	void method1() throws ArithmeticException,IOException  
	   {
		System.out.println(data/0);
	   }
	//not checked exception
	 void method2() throws ArithmeticException,Exception
	   {
		   System.out.println(data/0);
	   }
}
public class Demo2 {
	public static void main(String[] args) {
		
			}

}
