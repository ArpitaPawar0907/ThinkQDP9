package com.consructor;

public class ConstDemo {
	String name;
	ConstDemo()
	{
		System.out.println("Default constructor");
		name=null;
	}
    ConstDemo(String name)
    {
    	System.out.println("In parameterized constructer");
    	this.name=name;
    }
    public static void main(String[] args) {
		
    	ConstDemo c1=new ConstDemo();
    	ConstDemo c2=new ConstDemo("Reetu");
    	
    	System.out.println(c1.name);
    	System.out.println(c2.name);
    	
	}
}
