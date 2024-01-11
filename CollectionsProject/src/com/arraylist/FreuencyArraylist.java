package com.arraylist;

import java.util.ArrayList;

public class FreuencyArraylist {

	public static void findFrequency(ArrayList<String> list)
	{
		int count;
		for(int i=0;i<list.size();i++)
		{
			count=1;
			if(list.get(i).equals("visited"))
				continue;
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					count++;
					list.set(j, "visited");
				}		
			}
			System.out.println(list.get(i)+" ->"+count);
			
			
		}
	}
	public static void main(String[] args) {
		
		ArrayList<String > a1=new ArrayList<String>();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("A");
		a1.add("A");
		a1.add("B");
	findFrequency(a1);
	}
}
