package com.linkedlist;
/*
 *
41. Add heterogeneous elements to linked list.

 */
import java.util.LinkedList;

public class Q41HeterogenousElement {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

		list.add(23);
		list.add('a');
		list.add("name");
		list.add(98l);
		list.add(56.8f);
		list.add(77.6d);

	
		

		System.out.println(list);

	}
}
