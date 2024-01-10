package com.setassignment;
/*
 * 60. How to get synchronized set
 */
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Q60SynchronizedSet {

	public static void main(String args[]) 
	{ 
		 
		Set<Integer> number = new HashSet<Integer>(); 
		
	
		number.add(1); 
		number.add(2); 
		number.add(3); 
		number.add(4); 
		number.add(5); 
		
		Set<Integer> synset = Collections.synchronizedSet(number); 
		System.out.println("Synchronized Set: " + synset); 
	}
}
