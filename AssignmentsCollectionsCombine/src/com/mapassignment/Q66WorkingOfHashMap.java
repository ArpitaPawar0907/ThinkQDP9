package com.mapassignment;

/*
 * 66. Note how hashmap works internally in java.
 * 
 *  
    When a key-value pair is inserted into the hashmap, 
    the hashmap computes a hash code for the key using the hash function.
   
    The hash code is used to determine the index in the array where the key-value pair should be stored. The hash code is typically used to compute the remainder of the hash code divided by the size of the array, which ensures that the index is within the bounds of the array.
    If the index is already occupied by another key-value pair, a collision has occurred. 
   
    There are different ways to handle collisions, but a common approach
     is to use a linked list or a similar data structure to store multiple
      key-value pairs at the same index.
    
    When retrieving a value based on a key, 
     hashmap computes the hash code for the key and uses it to 
     find the index in the array where the value is stored.
    If the index contains a linked list or a similar data structure, 
    the hashmap searches through the list to find the key-value pair with the matching key.
   
    If the key is not found, the hashmap returns null or throws an 
    , depending on the implementation.
  
    To ensure efficient performance, the hashmap typically uses a load factor 
    to determine when to resize the array. When the number of key-value pairs exceeds
     the product of the load factor and the size of the array, the hashmap creates a new,
      larger array and rehashes all the key-value pairs into the new array.

 */
public class Q66WorkingOfHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
