package com.mapassignment;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 *  * 78. Show use of firstkey , lastkey , headmap , tailmap , submap 
 */
public class Q78MethodsOfTreeMap {

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

		
	
	}
}
