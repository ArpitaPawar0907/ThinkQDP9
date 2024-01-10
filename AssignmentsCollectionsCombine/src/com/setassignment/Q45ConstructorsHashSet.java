package com.setassignment;

import java.util.HashSet;

/*
 * 45. Create hashset by using all constructors of hashset class.

 */
public class Q45ConstructorsHashSet {
	
	public static void main(String[] args) {
		
		HashSet<String> color=new HashSet<String>();
		
		color.add("white");
		color.add("red");
		
		System.out.println("Default constructoer"+color);
		
		HashSet<Integer> num=new HashSet<Integer>(3);
		num.add(1);
		num.add(2);
		num.add(3);
		System.out.println("Capacity :"+num);

		HashSet<Integer> num2=new HashSet<Integer>(num);
		
		System.out.println("Passing collection :"+num2);
		
		HashSet<Integer> num3=new HashSet<Integer>(4, 0.2f);
		
		num3.add(10);
		num3.add(11);
		
		System.out.println("Load facotor"+num3);
	}

}
