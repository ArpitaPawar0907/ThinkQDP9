package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 34. Reverse an arraylist of 10 integers
 */
public class Q34ReverseArrayList {
	
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
		Collections.reverse(num);
		
		System.out.println(num);
	}

}
