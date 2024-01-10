package com.mapassignment;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;



/*81. Show one example of concurrentHashmap. 
 * 
 */
public class Q81CurrentHashMap {

	public static void main(String[] args) {
		
		  Map<String, Long> phoneBook = new ConcurrentHashMap<String, Long>();
	        phoneBook.put("arpita", 8149101254L);
	        phoneBook.put("pranay", 9020341211L);
	        phoneBook.put("reetu", 7788111284L);

	        Iterator<String> keyIterator = phoneBook.keySet().iterator();

	        System.out.println("Map Content before modification : " + phoneBook);
	        while (keyIterator.hasNext()) {
	            String key = keyIterator.next();
	            if ("arpita".equals(key)) {
	                phoneBook.put("pooja", 9220341211L);
	            }
	        }
	        System.out.println("Map Content after modification : " + phoneBook);
	}
}
