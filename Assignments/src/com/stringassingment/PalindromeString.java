package com.stringassingment;

public class PalindromeString {
	
	public static String reverseString(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
			
		}
		return rev;
	}
	public static void checkpalindrome(String s)
	{
		String rev=reverseString(s);
		if(s.equals(rev))
		   System.out.println("String is palindrome");
		else
			 System.out.println("String is not palindrome");
	}
	public static void main(String[] args) {
		
		String str="madam";
		checkpalindrome(str);
	
	}

}
