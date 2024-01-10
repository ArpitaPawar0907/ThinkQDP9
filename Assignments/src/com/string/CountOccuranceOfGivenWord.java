package com.string;

public class CountOccuranceOfGivenWord {
	
	public static void countOccurance(String s,String word)
	{
		int count=0;
		String starr[]=s.split(" ");
		for(int i=0;i<starr.length;i++)
		{
			if(starr[i].equalsIgnoreCase(word))
				count++;
		}
		System.out.println(word+" -- "+count);
	}
	public static void main(String[] args) {
		
		String str="rain rain coome again";
		countOccurance(str, "rain");
	}

}
