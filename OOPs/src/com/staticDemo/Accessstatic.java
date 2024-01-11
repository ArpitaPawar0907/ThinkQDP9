package com.staticDemo;

public class Accessstatic {

	int x=10;
	static int y=20;
	void instanceMethod()
	{
		System.out.println(x);
		System.out.println(y);
	}
	static void staticmethod()
	{
		//System.out.println(x); to access instance variable in static 
		System.out.println(y);
	  Accessstatic obj=new Accessstatic();
	  System.out.println(obj.x);
	}
	
	public static void main(String[] args) {
		
		staticmethod();
		Accessstatic ob=new Accessstatic();
		  System.out.println(ob.x);
		
		

	}

}
