package com.stringassingment;

public class ConcateLength {

	public static void concatString(String s)
	{
		s+=" Programming";
	}
	public static void calLen(String s)
	{
		int count=0;
		char ch[]=s.toCharArray();
		for(char c:ch)
		{
			count++;
		}
		System.out.println("length of "+s+" is "+count);
	}
	public static void main(String[] args) {
		String str="java";
		
		calLen(str);
		concatString(str);
	}
}
