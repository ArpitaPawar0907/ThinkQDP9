package com.vectorassignment;

import java.util.Enumeration;
import java.util.Vector;

/*
 * 97. Show in example that enumerator is fail safe.
 */
public class Q97FailSafeEnumerator {
	
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
			    if(en.nextElement().contains("red")) {
			    	color.add("Red");
			    	}
				System.out.println(en.nextElement());
			}
		}


}
