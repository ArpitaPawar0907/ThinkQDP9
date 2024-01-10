package com.linkedlist;
/*
 * 
43. Replace an element at specific position in linked list.
 */
import java.util.LinkedList;

public class Q43ReplaceElement {
	public static void main(String[] args) {
		
		
		LinkedList<String> flower = new LinkedList<String>();

		flower.add("rose");
		flower.add("daisy");
		flower.add("jasmin");
		flower.add("marigold");

		System.out.println("Linked List:" + flower);

		flower.set(2, "Mogra");

	}

}
