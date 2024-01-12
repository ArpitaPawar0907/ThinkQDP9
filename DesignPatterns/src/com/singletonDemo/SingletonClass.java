package com.singletonDemo;

public class SingletonClass {
	
	static SingletonClass sc=new SingletonClass();
	public String msg;
	private SingletonClass()
	{
		msg="hi";
	}

	public static SingletonClass getSingleton()
	{
	  	if(sc==null)
	  		sc=new SingletonClass();
	  	
	  	return sc;
	}
}
