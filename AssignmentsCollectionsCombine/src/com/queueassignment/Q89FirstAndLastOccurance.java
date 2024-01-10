package com.queueassignment;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 89. How do you remove first occurrence and last occurance of 
given element in linked list which implements queue.
 */
public class Q89FirstAndLastOccurance {
	

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
			
			System.out.println("remove first of Fox:"+animal.removeFirstOccurrence("fox"));
			System.out.println("remove Last of tiger:"+animal.removeLastOccurrence("tiger"));
			
			System.out.println(animal);
			
			

		
	}
}
