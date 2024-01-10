package com.vectorassignment;
/*
 * 
96. Iterate through vector using enumerator
 */

import java.util.Enumeration;
import java.util.Vector;

public class Q96IterateUsingEnumerator {

	public static void main(String[] args) {
		
	Vector<String> color=new Vector<>();
		
		color.add("red");
		color.add("blue");
		color.add("green");
		color.add("yellow");
		color.add("black");
		
		System.out.println(color);
	
		Enumeration<String> en=color.elements();
		while(en.hasMoreElements())
		{
		
			System.out.println(en.nextElement());
		}
	}
}
