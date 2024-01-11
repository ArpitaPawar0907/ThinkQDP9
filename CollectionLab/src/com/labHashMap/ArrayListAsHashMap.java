package com.labHashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ArrayListAsHashMap {

	public static void iterateArrayList(ArrayList<String> list)
	{
		for(String s:list)
		{
			System.out.println(s);
		}
	}
	
	public static void convertArrayListToHashMap(ArrayList<String> list)
	{
	//	int key=1;
		HashMap<Integer, ArrayList<String>> newHm=new HashMap<Integer,ArrayList<String>>();
		newHm.put(1, list);
		newHm.put(2, list);
		newHm.put(3, list);

		Set<Integer> keys=newHm.keySet();
		Iterator<Integer> itr=keys.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		hm.put(6, "six");
		
		for(Map.Entry<Integer,String> en:hm.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
		
		Collection<String> value=hm.values();
		
		ArrayList<String> hmList=new ArrayList<String>();
		
		hmList.addAll(value);
		
		System.out.println(hmList);		
		
		iterateArrayList(hmList);
		
		convertArrayListToHashMap(hmList);
	}
}
