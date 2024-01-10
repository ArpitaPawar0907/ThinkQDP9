package com.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * 24. What is difference between collection and collections. Give 
examples of 2 methods in each of them.

ans- collection is interface whereas collections is utility class.

 */
public class Q24CollectionAndCollections {
	
	public static void main(String[] args) {
		
		ArrayList<String> number=new ArrayList<String>();
		
		number.add("one");
		number.add("two");
		number.add("three");
		number.add("four");
		number.add("five");
		
		Collection<String> nym=new ArrayList<String>();
		
		Collections.sort(number);
		System.out.println(number);
		
	}

}
