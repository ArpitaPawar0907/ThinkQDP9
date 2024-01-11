package com.treeMapDemo;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethods {

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

		tmap.put(1, "java");
		tmap.put(3, "C++");
		tmap.put(8, ".net");
		tmap.put(6, "python");
		tmap.put(4, "Angular");

		System.out.println(tmap);
		System.out.println("First Key:" + tmap.firstKey());
		System.out.println("Last Key:" + tmap.lastKey());

		System.out.println("=-------------------------------------");

		SortedMap<Integer, String> s1 = tmap.subMap(3, 6);

		System.out.println(s1);

		SortedMap<Integer, String> s2 = tmap.headMap(3);

		System.out.println(s2);

		SortedMap<Integer, String> s3 = tmap.tailMap(3);

		System.out.println(s3);

		//Navigable map method
		
		System.out.println("=========================================");
		
		System.out.println("Lower Key:"+tmap.lowerKey(4));
		System.out.println("Floor key :"+tmap.floorKey(4));
		
		System.out.println("----------------------");
		System.out.println("Higher key:"+tmap.higherKey(6));
		System.out.println("Ceiling key"+tmap.ceilingKey(6));
		
		System.out.println("---------------------------------");
		
		SortedMap<Integer, String> sn1 = tmap.subMap(3,false, 6,true);

		System.out.println(sn1);

		SortedMap<Integer, String> sn2 = tmap.headMap(3,true);

		System.out.println(sn2);

		SortedMap<Integer, String> sn3 = tmap.tailMap(3,false);

		System.out.println(sn3);

		
	}

}
