package com.statickeyword;

public class StaticCounter {
     
	int a=0;
	static int counter=0;
	StaticCounter()
	{
		a++;
		counter++;
		System.out.println("a :"+a);
		System.out.println("Counter :"+counter);
	
	}
	
	
	public static void main(String[] args) {
	
		StaticCounter s1=new StaticCounter();
		StaticCounter s2=new StaticCounter();
		StaticCounter s3=new StaticCounter();
		
		
		
	}

}
