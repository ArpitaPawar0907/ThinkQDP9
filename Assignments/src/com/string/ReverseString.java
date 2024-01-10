package com.string;

public class ReverseString {
	
	public static String reverseString(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
	//	System.out.println("Reverse String :"+rev);
		return rev;
	}
	public static void reverseWord(String st)
	{
		String starr[]=st.split(" ");
		String revS="";
		for(int i=0;i<starr.length;i++)
		{
			revS+=reverseString(starr[i])+" ";
		}
		System.out.println(revS);
	}
	public static void main(String[] args) {
		
		String str="Hello World";
		System.out.println(str);
		//reverseString(str);
		
		reverseWord(str);
	}

}
