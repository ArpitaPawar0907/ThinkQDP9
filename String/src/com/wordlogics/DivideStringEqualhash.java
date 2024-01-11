package com.wordlogics;

import java.util.Arrays;

public class DivideStringEqualhash {

	
	public static void divideString(String s,int noOfC)
	{
		int len=s.length();
		//String s1="";
		if(len%noOfC!=0)
		{
			int x=len-(len%noOfC);
			
			for(int i=0;i<x;i++)
			{
				s=s.concat("#");
			}
			
	
		}
		// System.out.println(s);
		len=s.length();
		
			int n=len/noOfC;
			String splstr[]=new String[n];
			
			int index=0;
			for(int i=0;i<s.length();i+=noOfC)
			{
				splstr[index]=s.substring(i,i+noOfC);
				index++;
			}
			System.out.println(Arrays.toString(splstr));
		
	}
	
	public static void main(String[] args) {
		
		String st[]= {"i","am","very","smart"};
		String str=String.join("",st);
		//System.out.println(str);
		int noOfChar=5;
		divideString(str, noOfChar);
	}
}
