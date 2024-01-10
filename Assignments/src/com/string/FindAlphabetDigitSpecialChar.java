package com.string;

public class FindAlphabetDigitSpecialChar {
	
	public static void checkCharDigitSymbol(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>'a'|| s.charAt(i)<'z')
				System.out.println(s.charAt(i)+" alphabet");
			else if(s.charAt(i)>'0'||s.charAt(i)<'9')
				System.out.println(s.charAt(i)+" Digit");
			else
				System.out.println(s.charAt(i)+" Special symbol");
			
		}
	}
	public static void main(String[] args) {
		
		String str="pass@123";
		checkCharDigitSymbol(str);
	}

}
