package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
 *7 . Replace an element at particular position by given element.

 */
public class Q07ReplaceElement {

	public static void main(String[] args) {
		
		ArrayList<String> color=new ArrayList<>();
		
		color.add("red");
		color.add("blue");
		color.add("yellow");
		color.add("green");
		color.add("white");
		color.add("black");
		System.out.println(color);
		Collections.replaceAll(color, "red","Orange");
		System.out.println(color);
		
	}

}
