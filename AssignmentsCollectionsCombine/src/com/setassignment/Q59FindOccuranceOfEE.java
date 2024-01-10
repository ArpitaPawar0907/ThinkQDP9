package com.setassignment;

import java.util.ArrayList;

import java.util.HashSet;


/*
 * 59. Create hashset of 10 Strings. Remove elements from hashset 
of string contains more than one occurances of letter ‘e’
 */
public class Q59FindOccuranceOfEE {
	
	public static boolean findEE(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='e')
				count++;
		}
		if(count>1)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		
		HashSet<String> number=new HashSet<String>();
		
		number.add("one");
		number.add("two");
		number.add("three");
		number.add("four");
		number.add("five");
		number.add("six");
		number.add("seven");
		number.add("eight");
		number.add("nine");
		number.add("ten");
		
		System.out.println(number);
		
	   ArrayList<String> num=new ArrayList<String>(number);
	   for(int i=0;i<num.size();i++)
	   {
		   if(findEE(num.get(i))) {
			   num.remove(i);
		   }
	   }
		
		System.out.println(num);
	}

}
