package com.hashsetdemo;

import java.util.HashSet;

public class HashSetDemo {

	
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		
		hs.add("Cold Drink");
		hs.add("Juices");
		hs.add("chips");
		hs.add("Juises");
		
		

		HashSet<String> hs2=new HashSet<>();
		hs2.add("chips");
		hs2.add("Juises");
		hs2.add("Cheese");
		
		System.out.println(hs);
		System.out.println(hs2);
		
	}
}
