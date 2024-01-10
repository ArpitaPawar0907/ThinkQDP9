package com.arrayList;

import java.util.ArrayList;

/*
 * 16. Iterate through arraylist using foreach . 
 */
public class Q16IterateArrayList {

	public static void main(String[] args) {
		
	ArrayList<String> color=new ArrayList<String>();
		
		color.add("red");
		color.add("green");
		color.add("yellow");
		color.add("white");
		color.add("blue");
		color.add("purple");
	
		for(String s:color)
		{
			System.out.println(s);
		}


	}

}
