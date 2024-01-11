package com.labHashMap;

import java.util.HashMap;
import java.util.Set;

public class Q3PrintKeys {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hm=new HashMap<>();
		
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		hm.put("five", 5);
		
		Set<String> keys=hm.keySet();
		
		for(String s:keys)
		{
			System.out.println(s);
		}

	}

}
