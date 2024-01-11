package com.methodoverloading;

public class MethodOverLoadingExample {

	public void methodTest(Object object)
	{
		System.out.println("Calling object method");
	}
    public void methodTest(String object)
    {
    System.out.println("Calling string method");	
    }
    public void methodTest(Number object)
    {
    System.out.println("Calling number method");	
    }
    public void methodTest(Integer object)
    {
    System.out.println("Calling integer method");	
    }
    public void methodTest(Float object)
    {
    System.out.println("Calling float method");	
    }
    public void methodTest(double object)
    {
    System.out.println("Calling string method");	
    }
    
    
    
	public static void main(String[] args) {
		
        MethodOverLoadingExample moe=new MethodOverLoadingExample();
        //moe.methodTest(null);
        moe.methodTest(10);
        moe.methodTest(2.3f);
        moe.methodTest(4.5);
	}

}
//called String method