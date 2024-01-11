package com.hashmapdemo;

import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		
		hm.put(1,"pranali");
		hm.put(2,"prachi");
		hm.put(3,"reetu");
		hm.put(4,"nisha");
		hm.put(5,"pranay");
		
		System.out.println(hm);
		System.out.println("-----------------------------------");
		
      //   Set<Entry<Integer,String>>entries= hm.entrySet();

	}

}
