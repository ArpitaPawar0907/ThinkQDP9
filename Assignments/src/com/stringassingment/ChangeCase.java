package com.stringassingment;

public class ChangeCase {
	public static void toggle(String m)
	{
		
		int size=m.length();
		char c[]=m.toCharArray();
		
		for(int i=0;i<m.length();i++)
		{
	
			if(Character.isLowerCase(c[i]))
		      c[i]=Character.toUpperCase(c[i]);
			else if(Character.isUpperCase(c[i]))
				c[i]=Character.toLowerCase(c[i]);
			
			
		}
		System.out.println(c);
		
	}

	public static void main(String[] args) {
	
		
		String s="JaVa";
		System.out.println(s);
		toggle(s);
		

	}

}
