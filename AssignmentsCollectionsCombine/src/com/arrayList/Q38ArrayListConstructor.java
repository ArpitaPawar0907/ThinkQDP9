package com.arrayList;

import java.util.ArrayList;

/*
 * 38. Create arraylist using all constructors of arraylist class.
 */
public class Q38ArrayListConstructor {

	public static void main(String[] args) {
		
		ArrayList<String>name=new ArrayList<>();
		
		name.add("arpita");
	    name.add("prachi");
	    
	    ArrayList<Integer> id=new ArrayList<>(3);
	    
	    id.add(1);
	    id.add(2);
	    id.add(3);
	    
	    ArrayList<Integer> marks=new ArrayList<Integer>(id);
	    
	    marks.add(34);
	    marks.add(45);
	    
	    System.out.println(name);
	    System.out.println("--------------------");
	    System.out.println(id);
	    System.out.println("-----------------------");
	    System.out.println(marks);
	    
	    
		
	}
}
