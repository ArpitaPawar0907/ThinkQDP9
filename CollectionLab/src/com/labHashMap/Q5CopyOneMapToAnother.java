package com.labHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Q5CopyOneMapToAnother {

	public static void copyMap(HashMap<Integer, String> hmap, HashMap<Integer, String> newHm) {
		Set<Integer> keys = hmap.keySet();

		for (Integer i : keys) {
			newHm.put(i, hmap.get(i));
		}
	}

	public static void searchElement(HashMap<Integer, String> newHm, int key) {
		boolean found = false;

		for (Map.Entry<Integer, String> en : newHm.entrySet()) {
			if (en.getKey() == key) {
				found = true;
				System.out.println("Element found");
				System.out.println(en.getValue());
				break;
			} else {
				found = false;
			}

		}

		if (found == false)
			System.out.println("Key is not found");

	}

	public static void removeElement(HashMap<Integer, String> newHm, int key) {
		if (newHm.containsKey(key))
			newHm.remove(key);

		for (Map.Entry<Integer, String> en : newHm.entrySet()) {
			System.out.println(en.getKey() + "-->" + en.getValue());
		}

	}

	public static void emptyHashMap(HashMap<Integer, String> hm) {

		System.out.println("before:" + hm);
	
		Iterator<Map.Entry<Integer, String>> iterator = hm.entrySet().iterator();

		while (iterator.hasNext()) {

			Map.Entry<Integer, String> entry = iterator.next();
			iterator.remove();
		}
		System.out.println("after:"+hm);
	}

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");

		HashMap<Integer, String> newHm = new HashMap<Integer, String>();

		copyMap(hm, newHm);

		for (Map.Entry<Integer, String> en : newHm.entrySet()) {
			System.out.println(en.getKey() + "-->" + en.getValue());
		}
		System.out.println("--------------------------------------");
		searchElement(newHm, 6);
		System.out.println("----------------------------------------");
		removeElement(newHm, 5);
		System.out.println("-----------------------------------------");
		emptyHashMap(hm);

	}

}
