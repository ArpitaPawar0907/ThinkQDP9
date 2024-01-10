package com.string;

public class TrimWhiteSpaces {
	public static void trimspaces(String str)
	{
        String op = "";
 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
 
            
            if (!Character.isWhitespace(ch)) {
                op += ch;
            }
        }
        System.out.println(op);
    }
	
	public static void main(String[] args) {
		
		String str="i read the book";
		System.out.println(str);
		trimspaces(str);
	}

}
