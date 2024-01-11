package com.throwkeyword;

public class RethrowingException {
	
	public static void method1()
	{
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch (NullPointerException e) {
			
			System.out.println("In catch block");
			throw e;
		}
	}
    public static void main(String[] args) {
		
    	try
    	{
    		method1();
    	}catch (Exception ex) {
			
    		System.out.println("In main :"+ex);
    		//throw ex;
		}
	}
}
