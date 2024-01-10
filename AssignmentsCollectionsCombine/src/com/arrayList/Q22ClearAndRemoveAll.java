package com.arrayList;

import java.util.ArrayList;

/*
 * 22. What is difference between clear and removeall methods.
 * 
 * clear() returns type void 
 * 
 * removeAll() returns boolean value
 */
public class Q22ClearAndRemoveAll {
	
	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<>();
		
		name.add("arpita");
		name.add("pranay");
		name.add("reetu");
		name.add("prachi");
		name.add("jyoti");
		name.add("pooja");
		
		System.out.println(name);
		name.clear();
		name.removeAll(name);
		
		System.out.println(name);
		
	}

}







