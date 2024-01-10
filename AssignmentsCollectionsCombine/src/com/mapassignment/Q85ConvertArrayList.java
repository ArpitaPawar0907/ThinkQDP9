package com.mapassignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 85. Hashmap hmap contains integer keys and string values. 
Create two array lists, one will contain all keys and other will 
contain all values.

 */
public class Q85ConvertArrayList {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(1,"one");
		hm.put(2,"two");
		hm.put(3,"three");
		hm.put(4,"four");
		hm.put(5,"five");
		
		System.out.println("Hash Map");
		for(Map.Entry<Integer,String> en:hm.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
			
		}
		Set<Integer> keys=hm.keySet();
		Collection<String> val=hm.values();
		ArrayList<Integer> keyList=new ArrayList<Integer>(keys);
		
		ArrayList<String> values=new ArrayList<String>(val);
		
		System.out.println(keyList);
		
		System.out.println(values);
		

	}
}
