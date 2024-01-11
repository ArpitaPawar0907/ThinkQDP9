package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ConversionArrayToArrayList {

	public static void main(String[] args) {

		String color[] = { "red", "blue", "white", "orange" };
		System.out.println("Array: "+Arrays.toString(color));
		System.out.println("------------------------");
		// 1st way
//imp
		List<String> l1 = Arrays.asList(color);

		System.out.println("List: "+l1);
		System.out.println("------------------------");
		// 2 way

		ArrayList<String> a1 = new ArrayList<>(Arrays.asList(color));
		System.out.println("1 Array List"+a1);
		System.out.println("------------------------");
		ArrayList<String> a2 = new ArrayList<String>();
		Collections.addAll(a2, color);
		System.out.println("2 ArrayList:"+a2);
	}

}
