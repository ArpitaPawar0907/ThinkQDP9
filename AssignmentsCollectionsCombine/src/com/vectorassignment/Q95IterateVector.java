package com.vectorassignment;

import java.util.Iterator;
import java.util.Vector;

/*
 * 95. Iterate through vector using iterator.

 */
public class Q95IterateVector {

	public static void main(String[] args) {
		
	Vector<String> color=new Vector<>();
		
		color.add("red");
		color.add("blue");
		color.add("green");
		color.add("yellow");
		color.add("black");
		
		System.out.println(color);
	
		Iterator<String> itr=color.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
