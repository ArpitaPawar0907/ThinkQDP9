package com.string;
/*
 * 2.	Compare string using == when “” is present see same reference is there
 */
public class CompareString {

	public static void compareStringEqualtoop(String s1,String s2)
	{
		if(s1==s2)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}
	}
	
	public static void main(String[] args) {
		
		compareStringEqualtoop("Arpita","Arpita");
		String a="ab";
		String b="ba";
		
		
	}

}
