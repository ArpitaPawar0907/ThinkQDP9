package com.queueassignment;

import java.util.Deque;
import java.util.LinkedList;

/*
 * 90. How do you retrieve and remove an element from specific 
position of a linked list .
 */
public class Q90RemoveElement {
	
	public static void main(String[] args) {
		

		Deque<String> animal=new LinkedList<>();
		
		animal.add("tiger");
		animal.add("lion");
		animal.add("fox");
		animal.add("elephant");
		animal.add("tiger");
		animal.add("girrafee");
		animal.add("fox");
		
		
		System.out.println(animal);

		System.out.println(animal.element());

		System.out.println("Remove :"+animal.remove("elephant"));
	}

}
