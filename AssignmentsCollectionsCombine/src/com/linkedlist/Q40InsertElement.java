package com.linkedlist;
/*
 * 
40. Create linked list of 10 integers. Add a new element at 4th
position.


 */
import java.util.LinkedList;

public class Q40InsertElement {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(23);
		list.add(56);
		list.add(21);
		list.add(98);
		list.add(56);
		list.add(77);

		System.out.println(list);
		
		list.add(4, 66);
		System.out.println(list);

	}
}
