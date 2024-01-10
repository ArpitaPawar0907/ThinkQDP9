package com.string;

public class LastOccuranceOfWord {
	
	public static void findLastOccurance(String s,String word)
	{
		String starr[]=s.split(" ");
		int loc=0;
		for (int i = 0; i < starr.length; i++) {
			if(starr[i].equalsIgnoreCase(word))
				loc=i+1;
		}
		
		System.out.println(word+" last occurance is at "+loc);
	}
	public static void main(String[] args) {
		
		String str="jingle bells jingle bells jingle on the way";
		findLastOccurance(str, "jingle");
	}

}
