package com.mapassignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * 76. Iterate through map using iterator.
 */
public class Q76IterateUsingIterator {

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
		
		Set<String> keys=hm.keySet();
		Iterator<String> itr=keys.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}
}
