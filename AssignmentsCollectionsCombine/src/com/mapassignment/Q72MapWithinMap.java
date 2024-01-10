package com.mapassignment;

import java.util.HashMap;
import java.util.Map;


/*
 * 72. Create map within map. Iterate both. 
 */
public class Q72MapWithinMap {

	public static void main(String[] args) {

		HashMap<String, Long> stud1 = new HashMap<>();

		stud1.put("arpita", 975342322l);
		stud1.put("nisha", 687645444l);
		stud1.put("pranay", 9345245453l);
		
		HashMap<String, Long> stud2 = new HashMap<>();

		stud2.put("prachi", 783564553l);
		stud2.put("reetu", 7038536534l);
		stud2.put("pooja", 7038536534l);
		
		HashMap<String, HashMap<String, Long>> batch = new HashMap<>();

		batch.put("JAVA",stud1);
		batch.put("DF9",stud2);
		
		for(Map.Entry<String, HashMap<String, Long>> en:batch.entrySet())
		{
			System.out.println(en.getKey());
			System.out.println(en.getValue());
			System.out.println("--------------------------------------");
			
		}
		
		
	}
}
