package com.mapassignment;

import java.util.HashMap;

/*
 * 84. Add key value pair to hashmap if and only if it is not present 
in hashmap. Make use of putifabsent method.

 */
public class Q84AddPutIfAbsent {

	public static void main(String[] args) {
		
	HashMap<String,Integer> hm=new HashMap<String, Integer>();
		
		hm.put("one",1);
		hm.put("two",2);
		hm.put("three",3);
		hm.put("four",4);
		hm.put("five",5);
		hm.put("six",6);
		hm.put("seven",7);
		hm.put("eight",8);
		hm.put("nine",9);
		hm.put("ten",10);
	
		System.out.println(hm);
		hm.putIfAbsent("eleven",11);
		
		System.out.println(hm);

	}
}
