package com.hashmapdemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap<String,String>hmap=new HashMap<String, String>();
		
		hmap.put("India","+91");
		hmap.put("USa","+1");
		hmap.put("UAE","+971");
		hmap.put("Jermany","+49");
		
		System.out.println(hmap);
		
		System.out.println(hmap.put(null, "+0"));
		
		System.out.println(hmap.put(null, "+981"));
		
		hmap.put("South Korea", null);
		hmap.put("Italy", null);
		
		System.out.println(hmap);
		
		System.out.println("Size:"+hmap.size());
		
		System.out.println(hmap.get("India"));

		System.out.println(hmap.containsKey("Italy"));
		System.out.println(hmap.containsValue(null));
		
		
		System.out.println("-------------------------------------");
		
		hmap.putIfAbsent("Italy", "+0");
		System.out.println(hmap);
		hmap.putIfAbsent("Italy", "+45");
		
	}

}
