package com.hashsetdemo;

import java.util.HashSet;

public class ItemHashSet {

	public static void main(String[] args) {
		
		HashSet<Item> hs=new HashSet<Item>();
		hs.add(new Item(1, "sugar", 34));
		hs.add(new Item(2, "flour", 40));
		hs.add(new Item(3, "salt", 20));
		hs.add(new Item(4, "tea", 100));
		hs.add(new Item(2, "flour", 60));
		
		for(Item i:hs)
		{
			System.out.println(i);
		}
		

	}

}
