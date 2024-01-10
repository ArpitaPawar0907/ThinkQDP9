package com.arrayList;

import java.util.ArrayList;

/*
 * 15. Create arraylist ‘arrList’ within an arraylist. Use contains and 
containsall method to check if given individual element and 
arraylists are present in ‘arrList’ 
 */
public class Q15SearchElement {

	public static void main(String[] args) {
		
		ArrayList<String> color=new ArrayList<String>();
		
		color.add("red");
		color.add("green");
		color.add("yellow");
		color.add("white");
		color.add("blue");
		color.add("purple");
		
		ArrayList<String> arrList=new ArrayList<String>();
		
		arrList.add("red");
		arrList.add("yellow");
		System.out.println(color);
		
		System.out.println("list contains red color:"+color.contains("red"));
		
		System.out.println("list contains another list:"+color.containsAll(arrList));
		
	}

}
