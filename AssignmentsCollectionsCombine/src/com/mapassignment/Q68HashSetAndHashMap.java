package com.mapassignment;
/* 
68. What is difference between hashset and hashmap. 

Definition :
	Java HashMap is a hash table based implementation of Map interface. 
	HashSet is a Set. It creates a collection that uses a hash table for storage.
	
Implementation:
 	HashMap implements Map, Cloneable, and Serializable interface es.
 	HashSet implements Set, Cloneable, Serializable, Iterable and Collection interfaces.
 	
Stores: 
	In HashMap we store a key-value pair. It maintains the mapping of key and value. 	
In HashSet, we store objects.

Duplicate values 	:
It does not allow duplicate keys, but duplicate values are allowed. 
	It does not allow duplicate values.
	
Null values :
	It can contain a single null key and multiple null values. 
	It can contain a single null value.
	
Method of insertion :
	HashMap uses the put() method to add the elements in the HashMap. 
	HashSet uses the add() method to add elements in the HashSet.
	
Performance :
	HashMap is faster/ than HashSet because values are associated with a unique key.
	HashSet is slower than HashMap because the member object is used for calculating
	 hashcode value, which can be same for two objects.
	 
The Number of objects :
	Only one object is created during the add operation. 
	There are two objects created during put operation, one for key and one for value.
	
Storing Mechanism :	HashMap internally uses hashing to store objects. 
	HashSet internally uses a HashMap object to store objects.
	
Uses 	Always prefer when we do not maintain the uniqueness. 
	It is used when we need to maintain the uniqueness of data.
	
Example 	
{a->4, b->9, c->5} Where a, b, c are keys 
and 4, 9, 5 are values associated with key. 	
{6, 43, 2, 90, 4} It denotes a set. 
 */
public class Q68HashSetAndHashMap {

	public static void main(String[] args) {
		
	}
}
