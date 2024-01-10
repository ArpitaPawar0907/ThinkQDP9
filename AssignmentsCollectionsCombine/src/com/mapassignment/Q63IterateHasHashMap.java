package com.mapassignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * 63. Create hashmap<String, int>. Add 10 elements to hashmap 
and iterate map using for each loop and using iterator 
 */
public class Q63IterateHasHashMap {

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
		System.out.println("For each Loop");
		for(String s:keys)
		{
			System.out.println(s+"-->"+hm.get(s));
		}

		System.out.println("------------------------------");
		System.out.println("Iterator");
		Iterator<String> itr=keys.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
