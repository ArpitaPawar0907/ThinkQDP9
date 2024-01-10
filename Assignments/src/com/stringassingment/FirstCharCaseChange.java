package com.stringassingment;

public class FirstCharCaseChange {

	public static void changeCase(String s)
	{
		char ch[]=s.toCharArray();
		Character.toUpperCase(ch[0]);
	   for(int i=0;i<ch.length;i++)
	   {
		   if(ch[i]==' ')
		   {
			   Character.toUpperCase(ch[i+1]);
		   }
	   }
	   System.out.println(ch);
	}
	public static void main(String[] args) {
	
		String str="I love india";
		changeCase(str);

	}

}
