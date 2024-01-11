package com.throwkeyword;

public class UncheckedException {
	
	void method1()
	{
	 throw new RuntimeException();	
	}

	void method2()
	{
		method1();
	}
	
	void method3()
	{
		method2();
	}
	public static void main(String[] args) {
		 UncheckedException obj1=new UncheckedException();
		 
		 obj1.method3();
	}
}
