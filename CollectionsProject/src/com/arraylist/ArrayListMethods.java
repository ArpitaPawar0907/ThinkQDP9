package com.arraylist;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
	
		ArrayList<String> a1=new ArrayList<>();
		
		System.out.println(a1.isEmpty());
		System.out.println("----------------------------------------");
		a1.add("Red");
		a1.add("orange");
		a1.add("blue");
		a1.add("black");
		a1.add("white");
		
		System.out.println(a1);
		System.out.println("----------------------------------------");
		System.out.println(a1.isEmpty());
        System.out.println("--------------------------------------------");
        
        a1.add(2, "Green");//add value and shift
        System.out.println(a1);
		System.out.println("----------------------------------------");
		
		
		a1.set(2, "yellow");//changes value
		System.out.println(a1);
		System.out.println("----------------------------------------");
		
		
		System.out.println("Element removed:"+a1.remove(2));
		
		System.out.println("Remove orange"+a1.remove("orange"));
		System.out.println("Element contains red:"+a1.contains("Red"));
		System.out.println(a1);
		System.out.println("----------------------------------------");
		
		ArrayList<String > a2=new ArrayList<String>();
		
		a2.add("brown");
		a2.add("pink");
		
		System.out.println("Second ArrayList: "+a2);
		
		
		//a1.addAll(a2);   add last
		a1.addAll(2, a2);//specific loc
		System.out.println("add all a2 "+a1);
		System.out.println("----------------------------------------");
		
		a1.retainAll(a2);
		System.out.println(a1);
		System.out.println("----------------------------------------");
		
		
		
		
		
        
	}

}
