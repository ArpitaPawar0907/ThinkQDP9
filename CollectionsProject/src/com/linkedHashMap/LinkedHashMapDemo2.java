package com.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {
	
		LinkedHashMap<String,Double> lhm=new LinkedHashMap<String, Double>(10,0.9f,true);
		
		lhm.put("Abhay",67.4);
		lhm.put("Arpita",78.2);
		lhm.put("Nilam",53.4);
		lhm.put("simran",32.4);
		lhm.put("mansi",75.4);
		
		for(Map.Entry<String, Double> en:lhm.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}

		System.out.println(lhm.get("Nilam"));
		
		for(Map.Entry<String, Double> en:lhm.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}

	}

}
