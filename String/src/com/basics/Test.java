package com.basics;

public class Test {

	public static void calculate(String s)
	{
		int sum=0;
		//char ch[]=s.toCharArray();
		
//		for (int i = 0; i < ch.length; i++) {
//			ch[i]=Character.getNumericValue(ch[i]);
//		}
	    for(int i=0;i<s.length();i++)
	    {
	         if(s.charAt(i)>'0' && s.charAt(i)<'9')
	         {
	        	// sum+=s.charAt(i);
	        	sum+=Character.getNumericValue(s.charAt(i));
	         }
	    }
	    System.out.println(sum);
	}
	public static void main(String[] args) {
		
		String str="Java123";
		calculate(str);

	}

}
