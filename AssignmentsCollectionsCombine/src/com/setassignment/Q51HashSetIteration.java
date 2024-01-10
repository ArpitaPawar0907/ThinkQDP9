package com.setassignment;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 51. Create hashset of strings. Add 10 elements to the set. 
Iterate through hashset using iterator and for each loop. 
 */
public class Q51HashSetIteration {

	public static void main(String[] args) {
		
		HashSet<String> numbers=new HashSet<String>();
		
		numbers.add("one");
		numbers.add("two");
		numbers.add("three ");
		numbers.add("four");
		numbers.add("five");
		numbers.add("six");
		numbers.add("seven");
		numbers.add("eight");
		numbers.add("nine");
		numbers.add("ten");
		
		for(String s:numbers)
		{
			System.out.println(s);
		}
		
		System.out.println("---------------------------------");
		
	   Iterator<String> itr=numbers.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	}
	
}
