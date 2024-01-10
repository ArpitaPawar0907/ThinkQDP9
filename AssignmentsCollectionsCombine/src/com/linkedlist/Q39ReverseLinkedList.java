package com.linkedlist;
/*
 * 
39. Iterate through linked list using descending iterator.

 */
import java.util.LinkedList;
import java.util.ListIterator;

public class Q39ReverseLinkedList {
	
	public static void main(String[] args) {
		
	LinkedList<String> color=new LinkedList<String>();
		
		color.add("Red");
		color.add("pink");
		color.add("White");
		color.add("yellow");
		color.add("blue");

		System.out.println(color);

		ListIterator<String> litr=color.listIterator(color.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		

	}

}
