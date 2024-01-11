package com.methodOverriding;
class Parent
{
	int data=10;
	// not throwing an exception
   void method1()
   {
	   System.out.println(data);
   }
   //throwing an exception
   void method2() throws ArithmeticException
   {
	   System.out.println(data/0);
   }
}
class Child extends Parent
{
	//only unchecked exception
	void method1() throws RuntimeException//,Exception
	   {
		System.out.println(data/0);
	   }
	//not checked exception
	 void method2() throws ArithmeticException//,Exception
	   {
		   System.out.println(data/0);
	   }
}
public class Demo1 {
	public static void main(String[] args) {
		
		Child c1=new Child();
		c1.method1();
		c1.method2();
	}

}
