package com.arrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * 18. Traverse arraylist in reverse direction using list iterator.
 */
public class Q18ReverseArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> num=new ArrayList<>();
		
		num.add(12);
		num.add(45);
		num.add(33);
		num.add(96);
		num.add(23);
		System.out.println(num);
        System.out.println("-------------------------------------");  
		ListIterator<Integer> liter=num.listIterator(num.size());
		
		while(liter.hasPrevious())
		{
			System.out.print(liter.previous()+" ");
		}
	}
}
