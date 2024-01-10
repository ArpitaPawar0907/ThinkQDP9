package com.queueassignment;

import java.util.*;

/*
 * 93. Insert an element at end and tail of linked list. 
 */
public class Q93InsertAtTail {
	
	public static void main(String[] args) {
		
		Queue<Integer> num=new LinkedList<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		
		System.out.println(num);
		num.add(45);
		num.offer(44);
		System.out.println(num);
	}

}
