package com.vector;

import java.util.Vector;

public class VectorDEmo {

	public static void main(String[] args) {

		Vector<String> lang = new Vector<>(5, 2);

		System.out.println(lang.capacity());
		System.out.println(lang.size());
		System.out.println("--------------------------------");
		lang.add("C");
		lang.add("c++");
		lang.add("java");
		lang.add(".net");
		lang.add("angular");
       
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		System.out.println("----------------------------------------------");
		lang.add("Python");

		System.out.println(lang.capacity());
		System.out.println(lang.size());

	}

}
