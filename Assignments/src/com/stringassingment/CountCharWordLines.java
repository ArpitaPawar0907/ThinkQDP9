package com.stringassingment;

public class CountCharWordLines {
	
	public static void count(String s)
	{
		String arr[]=s.split("\n");
		System.out.println("Lines :"+arr.length);
		
		String arr2[]=s.split(" ");
		System.out.println("Words :"+arr2.length);
		System.out.println("characters :"+s.length());
		
	}
	public static void main(String[] args) {
		
		String str="arpita pawar\n java batch";
		count(str);
		
	}

}
