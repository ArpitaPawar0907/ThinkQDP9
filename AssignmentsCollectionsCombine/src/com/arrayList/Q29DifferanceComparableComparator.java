package com.arrayList;
/*
 *29. State difference between comparable and comparator 
interface.
   Comparable provides a single sorting sequence. 
   In other words, we can sort the collection on the
   basis of a single element such as id, name, and price.	
 The Comparator provides multiple sorting sequences. 
 In other words, we can sort the collection on the basis
  of multiple elements such as id, name, and price etc.
2) Comparable affects the original class, i.e., the actual class is modified.
	Comparator doesn't affect the original class, i.e.,
	 the actual class is not modified.
	 
	 
	 
3) Comparable provides compareTo() method to sort elements.
	Comparator provides compare() method to sort elements.
4) Comparable is present in java.lang package.	
 Comparator is present in the java.util package.
5) We can sort the list elements of Comparable type by Collections.sort(List) method.
	We can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.
 */
public class Q29DifferanceComparableComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
