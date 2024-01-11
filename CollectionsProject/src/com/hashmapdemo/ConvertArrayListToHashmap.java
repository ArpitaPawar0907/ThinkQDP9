package com.hashmapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConvertArrayListToHashmap {

	public static void conversion(ArrayList<String> list) {

		HashMap<String,Integer> hm=new HashMap<>();
		for(String s:list)
		{
			if(hm.containsKey(s))
			{
				hm.put(s,hm.get(s)+1);
			}
			else
			{
				hm.put(s,1);
			}
		}
		
		for(Map.Entry<String, Integer> en:hm.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
	}

	
	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<>();

		alist.add("A");
		alist.add("B");
		alist.add("C");
		alist.add("A");
		alist.add("A");
		alist.add("B");
		alist.add("C");
		alist.add("B");
		alist.add("A");
		
		System.out.println(alist);
		conversion(alist);
	}

}
