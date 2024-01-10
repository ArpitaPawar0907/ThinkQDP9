package com.arrayList;

import java.util.ArrayList;

/*
 * 19. Show use of retainall method of arraylist
 */
public class Q19RetainAllMethod {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> numList=new ArrayList<String>();
		
		numList.add("one");
		numList.add("two");
		numList.add("three");
		numList.add("four");
		numList.add("five");
		numList.add("six");
		numList.add("seven");
		
		System.out.println("Before retain all"+numList);
		ArrayList<String> list2=new ArrayList<String>();
		
		list2.add("six");
		list2.add("seven");
		list2.add("eight");
		list2.add("nine");
		list2.add("ten");
		
		numList.retainAll(list2);
		
		System.out.println("After retain all"+numList);
		
		
	}

}
