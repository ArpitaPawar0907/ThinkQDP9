package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IterateVector {

	public static void main(String[] args) {
		
		Vector<String> lang = new Vector<>(5, 2);

		lang.add("C");
		lang.add("c++");
		lang.add("java");
		lang.add(".net");
		lang.add("angular");

		System.out.println(lang);
		System.out.println("-------------------------------");

		for(int i=0;i<lang.size();i++)
		{
			System.out.println(lang.get(i));
		}
		System.out.println("---------------------------------");
		
		for(String s:lang)
		{
			System.out.println(s);
		}
		System.out.println("-------------------------------------");
		
		Iterator<String > itr=lang.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------------------");
		
		ListIterator<String> litr=lang.listIterator(lang.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		System.out.println("-------------------------------------------");
		
		Enumeration<String> en=lang.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}

}
