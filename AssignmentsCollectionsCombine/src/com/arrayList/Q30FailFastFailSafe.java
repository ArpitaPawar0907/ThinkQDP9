package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;



/*
 * 30. What is difference between Fail Safe and Fail Fast. Show 
example of each.

ans:
Using iterations we can traverse over the collections objects. 
The iterators can be either fail-safe or fail-fast.
Fail-safe iterators means they will not throw any exception 
even if the collection is modified while iterating over it.
Whereas Fail-fast iterators throw an exception(ConcurrentModificationException)
 if the collection is modified while iterating over it.
 */
public class Q30FailFastFailSafe {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		Iterator<Integer> itr = integers.iterator();
		while (itr.hasNext()) {
		    Integer a = itr.next();
		    integers.remove(a);
		}
	}

}
