package com.setassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/*
 * 57. How to sort hashset of 10 integers.
 */
public class Q57SortHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> num=new HashSet<Integer>();
		
		num.add(17);
		num.add(44);
		num.add(26);
		num.add(77);
		num.add(32);
		num.add(61);
		num.add(76);
		num.add(85);
		num.add(19);
		num.add(101);
		
	
		System.out.println(num);
		
		ArrayList<Integer> number=new ArrayList<Integer>(num);
		
		Collections.sort(number);
		
		System.out.println(number);
		
		
		
		
	}
}
