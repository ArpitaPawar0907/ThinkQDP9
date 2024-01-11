package com.wordlogics;

public class ReverseWordbyWord {
	
	public static void reverseWord(String st)
	{
		String str[]=st.split(" ");
		String rev="";
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
				rev+=str[i].charAt(j);
			}
			rev+=" ";
		}
		System.out.println(rev);
	}
	
		public static void main(String[] args) {
		
		String str="i love india";
		reverseWord(str);
		
	}

}
