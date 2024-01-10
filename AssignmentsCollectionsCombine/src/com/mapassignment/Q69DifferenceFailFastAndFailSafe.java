package com.mapassignment;
/*
 * 69. What is difference between fail-fast and fail-safe iterators 
 * 
 * Exception: 	It throws a ConcurrentModificationException 
 * in modifying the object during the iteration process. 	
 * It does not throw Exception.

Clone Object: 	No clone object is created during the iteration process.
 	A copy or clone object is created during the iteration process.

Memory utilization:
 	It requires low memory during the process. 
 		It requires more memory during the process.

Modification :	It does not allow modification during iteration. 
	It allows modification during the iteration process.
	
Performance:
 	It is fast. 	
 	It is slightly slower than Fail Fast.
 	
Examples :
	HashMap, ArrayList, Vector, HashSet, etc 	
	CopyOnWriteArrayList, ConcurrentHashMap, etc.
 */
public class Q69DifferenceFailFastAndFailSafe {

	public static void main(String[] args) {
		
	}
}
