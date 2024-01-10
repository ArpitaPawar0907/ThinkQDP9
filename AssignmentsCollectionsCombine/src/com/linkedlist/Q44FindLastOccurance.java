package com.linkedlist;
/*
 
44. How do you get last occurance of given element in linked 
list.
 */
import java.util.LinkedList;

public class Q44FindLastOccurance {
	public static void findOccuranceLast(LinkedList<String> list,String word)
	{
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals(word))
			{
				System.out.println(word+" at "+i+" position");
			}
		}
	}
	
	public static void main(String[] args) {

		LinkedList<String> color = new LinkedList<String>();

		color.add("Red");
		color.add("pink");
		color.add("White");
		color.add("yellow");
		color.add("blue");

		System.out.println(color);
		
		//System.out.println(color.removeFirstOccurrence("Red"));
		

		findOccuranceLast(color, "yellow");

	}
}
