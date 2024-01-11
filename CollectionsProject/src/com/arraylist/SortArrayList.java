package com.arraylist;

import java.util.ArrayList;

public class SortArrayList {

	public static void sortList(ArrayList<Integer> list)
	{
		for (int i = 0; i < list.size(); i++)
		{
			for (int j =i+1; j < list.size(); j++)
			{
				if(list.get(i)>list.get(j))
				{
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
	public static void main(String[] args) {

		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(78);
		a1.add(12);
		a1.add(34);
		a1.add(53);
		a1.add(12);
		a1.add(3);
		
		System.out.println("Before :"+a1);
		sortList(a1);
		System.out.println("After :"+a1);
		
		

	}

}
