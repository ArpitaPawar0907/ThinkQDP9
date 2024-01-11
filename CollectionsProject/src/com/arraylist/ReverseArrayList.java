package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void reveseList(ArrayList<String> list)
	{
		for(int i=0,j=list.size()-1;i<list.size()/2;i++,j--)
		{
			String temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}
	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("red");
		a1.add("orange");
		a1.add("green");
		a1.add("blue");
		a1.add("yellow");

		System.out.println(a1);

	//	reveseList(a1);
		
		Collections.reverse(a1);
	//	Collections.sort(a1);
		System.out.println(a1);
	}

}
