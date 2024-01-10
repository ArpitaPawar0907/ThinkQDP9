package com.string;
/*
 * 9.	WAP to split string into 2 tokens where string is “HELLO$WORLD
 */
public class Question09 {

	public static void main(String[] args) {
		
		String str="HELLO$WORLD";
		
		str=str+" ";
		
		char ch1='$',ch2;
		
		String str2="";
		
		for(int i=0;i<str.length();i++)
		{
			ch2=str.charAt(i);
			if(ch1==ch2 || i==str.length()-1)
			{
				System.out.println(str2);
				str2="";
			}
			else
			{
				str2+=ch2;
			}
		}
		
	}

}
