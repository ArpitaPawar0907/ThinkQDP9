package com.mapassignment;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


/*
 * 71. What is difference between enumerator and iterator.
 * 
 * 
Using Enumeration, you can only traverse the collection.
 You can’t do any modifications to collection while traversing it. 	
 Using Iterator, you can remove an element of the collection while traversing it.
 
Enumeration is introduced in JDK 1.0 
	Iterator is introduced from JDK 1.2
	
Enumeration is used to traverse the legacy classes like Vector, Stack and HashTable. 	
 Iterator is used to iterate most of the classes in the collection framework like ArrayList,
  HashSet, HashMap, LinkedList etc.
  
Methods : hasMoreElements() and nextElement() 	
Methods : hasNext(), next() and remove()

Enumeration is fail-safe in nature. 	
 Iterator is fail-fast in nature.
 
Enumeration is not safe and secured due to it’s fail-safe nature. 	
Iterator is safer and secured than Enumeration.
 */
public class Q71EnumeratorIterator {

	public static void main(String[] args) {
		
	HashMap<String,Integer> hm=new HashMap<String, Integer>();
		
		hm.put("one",1);
		hm.put("two",2);
		hm.put("three",3);
		hm.put("four",4);
		hm.put("five",5);
		
		System.out.println("Iterator");
		Iterator<Entry<String, Integer>> itr=hm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		System.out.println("--------------------------");
		System.out.println("Enumeration");
		
		Enumeration<String> en=Collections.enumeration(hm.keySet());
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		
		}
		
	}
}
