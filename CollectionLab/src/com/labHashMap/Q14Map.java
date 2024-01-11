package com.labHashMap;

import java.util.HashMap;
import java.util.Map;

public class Q14Map {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");

		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

		hm2.put(1, "one");
		hm2.put(2, "two");
		hm2.put(3, "three");
		hm2.put(4, "four");

		HashMap<Integer, String> hm3 = new HashMap<Integer, String>();

		hm3.put(1, "one");
		hm3.put(2, "two");
		hm3.put(3, "three");
		hm3.put(4, "four");

		HashMap<Integer, HashMap<Integer, String>> newhm = new HashMap<>();


		newhm.put(1, hm);
		newhm.put(2, hm2);
		newhm.put(3,hm3);

	//	System.out.println(newhm);
		
		for(Map.Entry<Integer, HashMap<Integer,String>> en:newhm.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}

	}

}
