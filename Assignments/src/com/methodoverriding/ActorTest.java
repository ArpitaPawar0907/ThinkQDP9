package com.methodoverriding;

class Person{
public void readScript()
{
	System.out.println("Person reads Script");
}

}

 class Actor extends Person {
	public void readScript()
	{
		System.out.println("Actor reads Script");
	}
 
}
public class ActorTest{
	public static void main(String args[])
	{
		Actor a1=new Actor();
		a1.readScript();
	}
}