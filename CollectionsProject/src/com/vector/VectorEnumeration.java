package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEnumeration {

public static void main(String[] args) {
		
		Vector<String> lang = new Vector<>(5, 2);

		lang.add("C");
		lang.add("c++");
		lang.add("java");
		lang.add(".net");
		lang.add("angular");
		System.out.println("-------------------------------------------");
		
		Enumeration<String> en=lang.elements();
		while(en.hasMoreElements())
		{
		
			System.out.println(en.nextElement());
		}
	}

}
