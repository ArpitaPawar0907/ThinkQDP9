package com.mapassignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 74. Create linkedhashmap<String, int> Take 5 values from user. 
 */
public class Q74UserInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<String, Integer> lhm=new LinkedHashMap<String, Integer>();
		System.out.println("Enter String key and Integer value i  Map");
		for (int i = 0; i < 5; i++) {
			
			lhm.put(sc.next(),sc.nextInt());
		}
		for(Map.Entry<String,Integer> en:lhm.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
	}
}
