package com.mapassignment;
/*
 * 82. Note differences in Hashmap, treemap, linkedhashmap and 
concurrenthashmap
1)Insertion order:
       - HashMap does not maintains any order for its objects.
		-LinkedHashMap maintains insertion order for its objects. 
		-TreeMap maintains ascending order for its objects.

2)Thread safty:
       - HashMap is not Thread-Safe because it is not synchronized.	
       -	LinkedHashMap is not Thread-Safe because it is not synchronized.
          It is slow as compared to HashMap because it uses Doubly Linked list
          internally which result into Time and space complexity overhead. 	
       - TreeMap is also not Thread-Safe because it is not synchronized. 
        It is slow as compared to HashMap and LinkedHashMap because of sorting
         operations as Comparator will be called for sorting purpose.
         
3)storing elements:
       -It uses buckets to store the elements. 
      -It uses doubly linked lists to store the elements. 
       -It uses Red black tree to store the elements.
 *
 */
public class Q82DHashMapTreeMapLinkedHashMap {

	public static void main(String[] args) {
		
	}
}
