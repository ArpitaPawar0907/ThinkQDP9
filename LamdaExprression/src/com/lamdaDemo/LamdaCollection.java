package com.lamdaDemo;

import java.util.ArrayList;

public class LamdaCollection {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		

		names.add("arpita");
		names.add("nisha");
		names.add("prachi");

		for(String s:names)
		{
			System.out.println(s);
		}
		names.forEach(n->System.out.println(n+"-"+n.length()));
		
		names.forEach(n->System.out.println(n+"-"+n.toUpperCase()));
	}

}
