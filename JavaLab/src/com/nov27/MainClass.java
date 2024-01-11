package com.nov27;

class A
{
	static void methodOne()
	{
		System.out.println("AAA");
	}
}
class B extends A
{
	static void methodOne()
	{
		System.out.println("BBB");
	}
}
public class MainClass {
	
	A a=new B();
	//a.methodOne();

}
//error 