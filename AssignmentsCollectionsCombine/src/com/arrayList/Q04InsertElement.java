package com.arrayList;

import java.util.ArrayList;

/*
 * 4. Create arraylist of 10 integers. Insert an element at 7th position.
 */
public class Q04InsertElement {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> num=new ArrayList<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
	
		System.out.println(num);
		
		num.add(7, 70);
		
		System.out.println(num);
	
		
	}

}
