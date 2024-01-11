package com.logicalString;

public class EncodeString {

	public static void replaceString(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				ch[i]='#';
			}
		}
		System.out.println(ch);
	}
	public static void main(String[] args) {

		String st="Education";
		System.out.println(st);
		replaceString(st);

	}

}
