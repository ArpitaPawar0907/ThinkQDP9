package com.treesetdemo;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {

		TreeSet<String> hs = new TreeSet<>();

		hs.add("Cold Drink");
		hs.add("Juices");
		hs.add("chips");
		hs.add("Juises");
	
		System.out.println(hs);
		System.out.println("--------------------------------");

		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------");
		
		Iterator<String> itr1=hs.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("------------------------------------");
		
		NavigableSet<String> nm=hs.descendingSet();
		for(String s:nm)
		{
			System.out.println(s);
		}
	}
}
