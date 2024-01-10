package com.arrayList;

import java.util.ArrayList;

/*
 * 5. Create arraylist of characters. Remove duplicate characters from 
the list. E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’} 
 */
public class Q05RemoveDuplicate {

	public static void removeDuplacate(ArrayList<Character> list)
	{
		ArrayList<Character> newList=new ArrayList<Character>();
		
		for(int i=0;i<list.size();i++)
		{
			if(!newList.contains(list.get(i)))
				newList.add(list.get(i));
				
		}
		
		System.out.println(newList);
	}
	public static void main(String[] args) {
		
		ArrayList<Character> alphabets=new ArrayList<>();
		
		alphabets.add('d');
		alphabets.add('g');
		alphabets.add('h');
		alphabets.add('d');
		alphabets.add('d');
		alphabets.add('h');
		alphabets.add('g');
		System.out.println(alphabets);
	   removeDuplacate(alphabets);
		
		
		
	}

}
