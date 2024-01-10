package com.queueassignment;

import java.util.Deque;
import java.util.LinkedList;

/*
 * 91. How do you retrieve but not remove an element from linked 
list.
 */
public class Q91RetriveElement {
	
	public static void main(String[] args) {
	

		Deque<String> animal=new LinkedList<>();
		
		animal.add("tiger");
		animal.add("lion");
		animal.add("fox");
		animal.add("elephant");
		animal.add("tiger");
		animal.add("girrafee");
		animal.add("fox");
		
         System.out.println(animal.getFirst());
		System.out.println(animal);
		
	

	}

}
