package com.string;

public class RemoveFirstOccurance {
	
	public static void rempoveChar(String old,char c)
	{
		String nstr="";
		for(int i=0;i<old.length();i++)
		{
			if(old.charAt(i)==c)
			{
				continue;
				
			}
			else
			{
				nstr+=old.charAt(i);
			}
		}
		System.out.println(nstr);
	}
	public static void main(String[] args) {
		String  str="good";
		char ch='d';
		System.out.println(str+" remove first occurance of "+ch);
		rempoveChar(str, ch);
	}

}
