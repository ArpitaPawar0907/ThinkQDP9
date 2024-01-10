package com.mapassignment;

import java.util.IdentityHashMap;
import java.util.Map;

/*
 * 77. Show one example of identity hashmap.
 */
public class Q77IdentityHashMap {

	public static void main(String[] args) {
		
		IdentityHashMap<Integer,String> num=new IdentityHashMap<Integer, String>();
		
		num.put(1, "one");
		num.put(2, "two");
		num.put(3, "three");
		num.put(4, "four");
		num.put(5, "five");
		
		for(Map.Entry<Integer, String> en:num.entrySet())
		{
		System.out.println(en.getKey()+"-->"+en.getValue());
		}
		
	}
}
