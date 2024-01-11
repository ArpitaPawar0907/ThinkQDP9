package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class FailfastIterator {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Kiwi");
		a1.add("orange");
		a1.add("banana");
		a1.add("apple");
		a1.add("cherries");
		
		System.out.println(a1);
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals("apple"))    
			a1.add("pineapple");    
		}
//concurret modification exception as we make changes while itrating list
  
		System.out.println(a1);
	}

}
