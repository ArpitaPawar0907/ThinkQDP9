package com.hashmapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IterationMap {
	
	public static void main(String[] args) {
		
		HashMap<String, Float> hm=new HashMap<String, Float>();
		hm.put("reetu", 89.0f);
		hm.put("pranali", 95.8f);
		hm.put("pooja", 67.40f);
		hm.put("baskar", 50.0f);
		hm.put("prachi", 78.4f);
		
		System.out.println(hm);
		System.out.println("-------------------------------------");
		Set<String> keys=hm.keySet();
		System.out.println("for each");
		for(String s:keys)
		{
			System.out.println(s+"-->"+hm.get(s));
		}
		
		System.out.println("-------------------------------------");
		
		Iterator<String> itr=keys.iterator();
		System.out.println("Iterator");
		while(itr.hasNext())
		{
			String k=itr.next();
			System.out.println(k+"-->"+hm.get(k));
		}
		System.out.println("-------------------------------------");
		System.out.println("collection");
		Collection<Float> c=hm.values();
		for(Float f:c)
		{
			System.out.println(f);
		}
		System.out.println("-------------------------------------");
		System.out.println("Entry set");
		
		Set<Entry<String,Float>> entries=hm.entrySet();
		
		for(Entry<String, Float> en:entries)
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
		
		System.out.println("-------------------------------------");
		
		
	}

}
