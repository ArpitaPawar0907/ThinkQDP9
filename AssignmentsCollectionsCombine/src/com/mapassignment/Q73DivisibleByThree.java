package com.mapassignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 73. Create a hashmap <int,String> where key is integers 1 to 
10 and string is number in words. Remove entry for which 
number is divisible by 3 
 */
public class Q73DivisibleByThree {

	public static void main(String[] args) {
		HashMap<Integer,String> num=new HashMap<Integer, String>();
		num.put(1, "one");
		num.put(2, "two");
		num.put(3, "three");
		num.put(4, "four");
		num.put(5, "five");
		num.put(6, "six");
		num.put(7, "seven");
		num.put(8, "eight");
		num.put(9, "nine");
		num.put(10, "ten");
		
		for(Map.Entry<Integer, String> en:num.entrySet())
		{
		System.out.println(en.getKey()+"-->"+en.getValue());
		}
		
		Set<Integer> keys=num.keySet();
		
		for (int i = 1; i <keys.size(); i++) {
			if(i%3==0)
			{
				num.remove(i);
			}
		}
		System.out.println("After removeing :");
		for(Map.Entry<Integer, String> en:num.entrySet())
		{
		System.out.println(en.getKey()+"-->"+en.getValue());
		}
		
		
	}
}
