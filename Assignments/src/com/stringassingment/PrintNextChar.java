package com.stringassingment;

public class PrintNextChar {
	
	public static void findNextChar(String s)
	{
	 char ch[]=s.toCharArray();
	 for(int i=0;i<ch.length;i++)
	 {
		 ch[i]=(char) (ch[i]+1);
		 
	 }
	 System.out.println(ch);
	}
	public static void main(String[] args) {
	
		String st="java";
		System.out.println(st);
		findNextChar(st);

	}


}
