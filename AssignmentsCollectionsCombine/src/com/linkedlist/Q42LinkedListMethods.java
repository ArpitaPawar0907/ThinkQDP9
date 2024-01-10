package com.linkedlist;
/*
 * 
42. Show use of addfirst , addlast, getfirst, getlast, remove first, 
remove last methods of linked list.

 */
import java.util.LinkedList;

public class Q42LinkedListMethods {
	
	public static void main(String[] args) {
		
		LinkedList<String> comp=new LinkedList<String>();
		
	
			comp.add("HCL");		
			comp.add("Infosys");		
			comp.add("Dell");
			comp.add("Cozigninat");
			comp.add(null);
			comp.add("HCL");
			
			System.out.println(comp);
	          
			comp.addFirst("HP");
	
	        System.out.println(comp);
			
			System.out.println("---------------------------------------");
			
			comp.addLast("acer");
			System.out.println(comp);
			System.out.println("-------------------------------------");
			
			
			System.out.println("First:"+comp.getFirst());
			System.out.println("Last:"+comp.getLast());
			
			System.out.println("----------------------------------------");
			
			System.out.println(comp.removeFirst());
			System.out.println(comp.removeLast());
	}

}
