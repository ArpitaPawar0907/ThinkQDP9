package com.arrayList;

import java.util.ArrayList;

/*
 * 13. Create an array which contains heterogeneous elements. 
 */
public class Q13HeterogeneousElements {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList<>();
		
		list.add('a');
		list.add("list");
		list.add(12);
		list.add(34.5f);
		
		
		System.out.println(list);
	}

}
