package com.arrayList;
/*
 * 3. Create a arraylist of string. Add 7 days to list ( Monday , Sunday 
etc) Remove elements from list for which string length is more 
than 7 
 */
import java.util.ArrayList;

public class Q03Days {

	public static void main(String[] args) {
		

		ArrayList<String> day = new ArrayList<>();


		day.add("Monday");
		day.add("Tuesday");
		day.add("Wednsday");
		day.add("thursday");
		day.add("friday");
		day.add("satursday");
		day.add("sunday");
		
		for(int i=0;i<day.size();i++)
		{
			if(day.get(i).length()>7)
				day.remove(i);
		}
		for(String s:day)
		{
			System.out.println(s);
		}


	}

}
