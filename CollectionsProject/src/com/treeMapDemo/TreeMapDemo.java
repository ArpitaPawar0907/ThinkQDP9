package com.treeMapDemo;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<String,Double> lhm=new TreeMap<String, Double>();
		
		lhm.put("Abhay",67.4);
		lhm.put("Arpita",78.2);
		lhm.put("Nilam",53.4);
		lhm.put("simran",32.4);
		lhm.put("mansi",75.4);
		
		for(Map.Entry<String, Double> en:lhm.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
		System.out.println("=============================================");
		
		System.out.println("Added iteration  ways");
		NavigableMap<String,Double> nm=lhm.descendingMap();
		
		for(Map.Entry<String,Double> en:nm.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
		
		System.out.println("-----------------------------------------");
		
		NavigableSet<String> key=lhm.navigableKeySet();
		for(String s:key)
		{
			System.out.println(s+"-->"+lhm.get(s));
		}
		
		

	}

}
