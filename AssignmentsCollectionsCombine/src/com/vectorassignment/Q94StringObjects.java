package com.vectorassignment;

import java.util.Vector;

/*
 * 94. Create a vector of 5 string objects. Add 5 strings to i
 */
public class Q94StringObjects {
	
	public static void main(String[] args) {
		
		Vector<String> color=new Vector<>();
		
		color.add("red");
		color.add("blue");
		color.add("green");
		color.add("yellow");
		color.add("black");
		
		System.out.println(color);
	}

}
