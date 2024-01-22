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
		
			for(int i=0;i<x/5;i++)
			{
				s=s.concat("#");
			}
			
	
		}
		 System.out.println(s);
		int l2=s.length();
		
			int n=l2/noOfC;
			String splstr[]=new String[n];
			
			int index=0;
			for(int i=0;i<s.length();i+=noOfC)
			{
				splstr[index]=s.substring(i,i+noOfC-3);
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
