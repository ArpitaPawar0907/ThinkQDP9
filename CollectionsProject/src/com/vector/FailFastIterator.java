package com.vector;

import java.util.Iterator;
import java.util.Vector;

public class FailFastIterator {

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
	    	if(num.get(3)==4)
	    		num.add(6);
	    }
	    
	    System.out.println(num);
	}

}
