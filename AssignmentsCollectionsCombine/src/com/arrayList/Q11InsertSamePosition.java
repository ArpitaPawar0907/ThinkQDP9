package com.arrayList;

import java.util.ArrayList;

/*
 * 11. Insert more than one element at particular position in 
arraylist.
 
 */
public class Q11InsertSamePosition {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		numbers.add(23);
		numbers.add(56);
		numbers.add(10);
		numbers.add(64);
		numbers.add(98);
		numbers.add(24);
		
		System.out.println(numbers);
		
		numbers.add(3, 30);

		numbers.add(3,31);
		numbers.add(3,32);
		System.out.println(numbers);
		
		
	}

}
