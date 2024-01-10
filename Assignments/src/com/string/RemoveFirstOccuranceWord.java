package com.string;

public class RemoveFirstOccuranceWord {
	
	public static void findFirstOccurance(String s,String word)
	{
		String starr[]=s.split(" ");
		String str="";
	
		for (int i = 0; i < starr.length; i++) {
			
			if(starr[i].equalsIgnoreCase(word))
				continue;
			else
				str+=starr[i]+" ";
		}
		
		System.out.println(str);
	}
	public static void main(String[] args) {
		
		String str="jingle bells jingle bells jingle on the way";
		findFirstOccurance(str, "jingle");
	}
	
	

}
