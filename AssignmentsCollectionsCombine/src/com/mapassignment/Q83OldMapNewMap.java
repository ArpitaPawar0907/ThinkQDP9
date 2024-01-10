package com.mapassignment;

import java.util.Collection;
import java.util.HashMap;


/*
 * 83. Write a program to create a hashmap as follows.
a. A hashmap ‘oldMap’ has multiple duplicate values. Write a 
program to create new hashmap ‘newMap’ which contains 
keys as unique values of ‘oldMap’ and values as count of 
number of times value has appeared in ‘map’.
b. e.g oldMap = (1, ‘a’) , (2,’b’), (3,’c’), (4,’b’), (5,’a’), (6,’a’), 
i. newMap = {‘a’,3) , (‘b’,2),(‘c’,1);

 */
public class Q83OldMapNewMap {

	public static void main(String[] args) {
		
		HashMap<Integer, Character> oldMap=new HashMap<Integer, Character>();
		
		oldMap.put(1,'a');
		oldMap.put(2,'b');
		oldMap.put(3,'c');
		oldMap.put(4,'b');
		oldMap.put(5,'a');
		oldMap.put(6,'a');
		
		System.out.println("OldMap:"+oldMap);
        Collection<Character> val=oldMap.values();
        
        HashMap<Character,Integer> newMap=new HashMap<Character, Integer>();
        for(Character c:val)
        {
            if(newMap.containsKey(c))
            {
            	newMap.put(c,newMap.get(c)+1);
            }
            else
            {
            	newMap.put(c, 1);
            }
        }

        System.out.println("NewMAp"+newMap);
	}
}
