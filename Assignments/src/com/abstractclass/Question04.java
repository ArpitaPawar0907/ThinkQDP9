package com.abstractclass;

abstract class Temp
{//class with no  method
	
}
abstract class Temp2 
{//class with no abstract method
   
	void display()
	{
		System.out.println("Abstract class");
	}
}
interface example 
{
	void show();
	
}
abstract class exampleTest implements example,test1//abstract class can implement two interface
{
	//we can have concreate and implemented method
	void display()
	{
		System.out.println("Abstract class");
	}
//	public void show()
//	{
//		System.out.println("interface method");
//	}
}
interface test1
{
	
}
//interface Example2 extends exampleTest
//{
//	interface cannot extent class
//}
public class Question04 {

	public static void main(String[] args) {
		
	//	Temp t1=new Temp(); we cannot create object of abstract class
		

	}

}
