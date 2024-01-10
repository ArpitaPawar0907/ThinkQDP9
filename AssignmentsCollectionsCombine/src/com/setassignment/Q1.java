package com.setassignment;

import java.util.*;



public class Q1 {
	public static void main(String[] args) {
		
		LinkedList<Integer> num=new LinkedList<Integer>();
		
		num.add(2);
		num.add(8);
		num.add(5);
		num.add(1);
		Iterator<Integer> i=num.iterator();
		Collections.reverse(num);
		Collections.shuffle(num);
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
