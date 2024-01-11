package com.wordlogics;

public class ReverseString {

	public static void reverseString1(String s)
	{
	//	String rev="";
		for(int i=0;i<s.length();i++)
		{
			
		}
	}
	public static void reverseString2(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0, j=ch.length-1;i<ch.length/2;i++,j--)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		System.out.println(ch);
	}
	
	public static void main(String[] args) {
	
		String str=" i love india";
		System.out.println(str);
		reverseString2(str);

	}

}
