package com.arrayList;

import java.util.ArrayList;

/*
 * 36. How to get sublist from an arraylist.
 */
public class Q36SubListFromArrayList {

	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<String>();

		strList.add("blue");
		strList.add("orange");
		strList.add("green");
		strList.add("black");
		strList.add("red");

		ArrayList<String> subList = new ArrayList<String>();
		strList.subList(2,4);
		
		System.out.println(strList);
		System.out.println("--------------------------------------");
		System.out.println(subList);
	}

}
