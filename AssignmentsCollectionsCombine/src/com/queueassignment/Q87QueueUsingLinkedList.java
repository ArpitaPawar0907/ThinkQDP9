package com.queueassignment;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 87. Implement queue interface using linked list.

 */
public class Q87QueueUsingLinkedList {
	
	public static void main(String[] args) {
		
		Queue<String> animal=new LinkedList<>();
		
		animal.add("tiger");
		animal.add("lion");
		animal.add("fox");
		animal.add("elephant");
		
		System.out.println(animal);
		
	}

}
