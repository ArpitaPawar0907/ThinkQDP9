package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConverSionArrayListtoArray {
	public static void main(String[] args) {
		
	ArrayList<String> a1=new ArrayList<>();
		
		a1.add("Red");
		a1.add("orange");
		a1.add("blue");
		a1.add("black");
		a1.add("white");
		
	
		Object[]  col=a1.toArray();
		for (int i = 0; i < col.length; i++) {
			col[i]=((String) col[i]).concat(" color");
		}
		System.out.println(Arrays.toString(col));
		String col2[]=new String[a1.size()];
		
		a1.toArray(col2);
		
		System.out.println(Arrays.toString(col2));
		
	}

}
