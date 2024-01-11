package com.lab;

public class Pattern1 {
	
	public static void printPattern(String s)
	{
		System.out.println(s);
	     String p=" ";
		for(int i=0;i<s.length();i++)
		{
			   p+=s.charAt(i);
		   System.out.println(p);
	
		   
		}
	}
	
	public static void logic2(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.substring(0, i+1));
		}
	}
	public static void main(String[] args) {
		
		printPattern("hello");
		logic2("hello");
		
	}

}
