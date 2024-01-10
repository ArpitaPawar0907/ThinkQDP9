package com.setassignment;

import java.util.Arrays;
import java.util.HashSet;

/*
 * 47. Convert hashset of strings to string array.
 */
public class Q47HashSetToStringArray {
	
	public static void main(String[] args) {
		
		HashSet<String> animal=new HashSet<String>();
		
		animal.add("lion");
		animal.add("tiger");
		animal.add("elephnat");
		animal.add("fox");
		
		System.out.println("Hash set"+animal);
		
		String arr[]=new String[animal.size()];
		int i=0;
		for(String s:animal)
		{
			arr[i]=s;
			i++;
		}
		System.out.println("String array :"+Arrays.toString(arr));
	}

}
