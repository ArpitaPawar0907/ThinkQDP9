package com.vectorassignment;

import java.util.Iterator;
import java.util.Vector;

/*
 * 98. Show in program that iterator is fail fast.

 */
public class Q98FailFastIterator {
	
	public static void main(String[] args) {
		
		Vector<Integer> num=new Vector<>(5);
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		System.out.println(num);
	    Iterator<Integer> itr=num.iterator();
	    while(itr.hasNext())
	    {
	    	if(num.get(3)==4) {
	    		num.remove(0);
	    	}
	    }
	    
	    System.out.println(num);
	}


}
