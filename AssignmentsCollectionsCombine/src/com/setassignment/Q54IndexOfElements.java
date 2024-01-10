package com.setassignment;

/*
 * 54. Create a treeset of 6 strings. Find the index of string given 
by user. 
 */


import java.util.TreeSet;

public class Q54IndexOfElements {
	
	public static void main(String[] args) {

		TreeSet<String> ts=new TreeSet<String>();
		ts.add("one");
		ts.add("two");
		ts.add("three");
		ts.add("four");
		ts.add("five");
		ts.add("seven");
		
		System.out.println(ts);
		int i=0;
		System.out.println("-----------------------");
		for(String s:ts)
		{
			System.out.println(s+" index pos:"+i);
			i++;
		}
		
		

		}
}
