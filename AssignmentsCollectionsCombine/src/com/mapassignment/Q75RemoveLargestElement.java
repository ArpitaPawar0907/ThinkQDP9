package com.mapassignment;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 75. Remove largest value from linked hashmap. 
 */
public class Q75RemoveLargestElement {

	public static void main(String[] args) {
	
		int max=0;
		int maxKey = 0;
		LinkedHashMap<Integer, Integer> lhm=new LinkedHashMap<>();
		lhm.put(1,34);
		lhm.put(2,62);
		lhm.put(3,35);
		lhm.put(4,82);
		lhm.put(5,9);
		
		for(Map.Entry<Integer,Integer> en:lhm.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
		for(Map.Entry<Integer,Integer> en:lhm.entrySet())
		{
			if(en.getValue()>max)
			{
				max=en.getValue();
				maxKey=en.getKey();
			}
		}
		
		lhm.remove(maxKey);
		System.out.println("After removing largest");
		for(Map.Entry<Integer,Integer> en:lhm.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
	}
}

