package com.stringassingment;

public class ReplaceVoewls {
	
	public static void replaceVowel(String s)
	{
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]='#';
			}
		}
		String s1=new String(ch);
		System.out.println("new String :"+s1);
	}
     public static void main(String[] args) {
		
    	 String str="i love india";
    	 System.out.println(str);
    	 replaceVowel(str);
    	
	}
}
