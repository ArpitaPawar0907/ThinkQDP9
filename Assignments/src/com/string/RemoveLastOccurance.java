package com.string;

public class RemoveLastOccurance {
	
	public static void lastOccurance(String s,char ch)
	{
	
		String newStr="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)==ch)
				continue;
			else
				newStr+=s.charAt(i);
			
		}
		System.out.println(" After: "+newStr);
	}
	public static void main(String[] args) {
		
		String str="missing";
		char c='i';
		System.out.println(str);
		lastOccurance(str, c);
		
	}

}
