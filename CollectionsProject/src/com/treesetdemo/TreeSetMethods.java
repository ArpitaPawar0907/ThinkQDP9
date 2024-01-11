package com.treesetdemo;

import java.util.TreeSet;

public class TreeSetMethods {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<>();
		
		ts.add(23);
		ts.add(12);
		ts.add(43);
		ts.add(78);
		ts.add(65);
		
		System.out.println(ts);
		
		System.out.println("First:"+ts.first());
		System.out.println("Last:"+ts.last());
		System.out.println("------------------------");
		System.out.println("Lower:"+ts.lower(43));
		System.out.println("Floor:"+ts.floor(43));
		System.out.println("---------------------------");
		System.out.println("Higher:"+ts.higher(65));
		System.out.println("Ceiling:"+ts.ceiling(65));
		
		System.out.println("------------------------------------");
		
		System.out.println(ts.headSet(43,true));
		System.out.println(ts.tailSet(43,true));
		
		System.out.println("-----------------------------");
		
		System.out.println(ts.subSet(12,true, 78,true));
		
		
	}

}
