package com.basics;

public class Stringintrens {

	public static void main(String[] args) {
		
		String s1="java";
		String s2=new String("java");
		System.out.println(s1==s2);
		s2=s2.intern();
		System.out.println(s1==s2);
		
		
	}

}
