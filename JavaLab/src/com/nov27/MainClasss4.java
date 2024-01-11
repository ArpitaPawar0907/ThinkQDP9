package com.nov27;
class A2
{
	public A2(int i)
	{
		System.out.println(myMethod(i));
	}
	int myMethod(int i)
	{
		return ++i +--i;
	}
}
class B2 extends A2
{
	public B2(int i,int j)
	{
		super(i*j);
		System.out.println(myMethod(i,j));
	}
	
	int myMethod(int i,int j)
	{
		return myMethod(i*j);
	}
	
}
public class MainClasss4 {

	public static void main(String[] args) {
		
		//B b=new B(12,21);

	}

}
