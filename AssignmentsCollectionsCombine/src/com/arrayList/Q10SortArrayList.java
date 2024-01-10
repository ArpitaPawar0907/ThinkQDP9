package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 10. Sort arraylist of Strings. 
 */
public class Q10SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> strList=new ArrayList<String>();
		
		strList.add("blue");
		strList.add("orange");
		strList.add("green");
		strList.add("black");
		strList.add("red");
		
		Collections.sort(strList);
		
		System.out.println(strList);
		
	}

}
