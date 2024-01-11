package com.labHashMap;

import java.util.Collection;
import java.util.HashMap;

public class Q4Getvalues {

	public static void main(String[] args) {
		
		HashMap<String,Long> hm=new HashMap<>();
		
		hm.put("arpita", 975342322l);
		hm.put("nisha", 687645444l);
		hm.put("pranay", 9345245453l);
		hm.put("prachi", 783564553l);
		hm.put("reetu", 7038536534l);
		
		Collection<Long> value=hm.values();
		for(Long l:value)
		{
			System.out.println(l);
		}

	}

}
