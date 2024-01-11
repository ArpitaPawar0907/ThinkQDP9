package com.linkedlist;


import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> comp=new LinkedList<String>();
		
		//	System.out.println(comp.getFirst());
			System.out.println(comp.peek());
			System.out.println(comp.peekFirst());
			comp.add("HCL");		
			comp.add("Infosys");		
			comp.add("Dell");
			comp.add("Cozigninat");
			comp.add(null);
			comp.add("HCL");
			
			System.out.println(comp);
	          
			comp.addFirst("HP");
			comp.offerFirst("genpact");
	        System.out.println(comp);
			
			System.out.println("---------------------------------------");
			
			comp.add(3,"Acer");

	}

}
