package com.labHashMap;

import java.util.HashMap;
import java.util.Set;

public class Q1HashMapGeneric {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap=new HashMap<>();
		
		hmap.put(1,"arpita");
		hmap.put(2,"prachi");
		hmap.put(3, "reetu");
		hmap.put(4,"nisha");
		hmap.put(5, "pranali");
	
		Set<Integer> keys=hmap.keySet();
		for(Integer i:keys)
		{
			System.out.println(i+"-->"+hmap.get(i));
		}

	}

}
