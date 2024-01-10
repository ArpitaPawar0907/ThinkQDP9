package com.stringassingment;

public class ChangeCaseVowel {
	
	public static void vowelCase(String s)
	{
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(ch);
	}
    public static void main(String[] args) {
		
    	String str="sonali";
    	System.out.println(str);
    	vowelCase(str);
	}

}
