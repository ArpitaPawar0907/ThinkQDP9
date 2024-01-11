package com.lab;

public class Computer {
	
	public static void reverseString(String s)
	{
	  String temp[]=s.split(" ");
	  String rev="";
	  
//	  int sp1=s.lastIndexOf(' ');
//	  int sp2=s.indexOf(' ');
	  for(int i=temp.length-1;i>=0;i--)
	  {
		  rev+=temp[i];
			rev+=" ";	  
	  }
	  System.out.println(rev);
		
	}
	
	public static void logic2(String s1)
	{
		s1+=" ";
	   String s2="";
	   String s3="";
	   for(int i=0;i<s1.length();i++)
	   {
		   if(s1.charAt(i)!=' ')
		   {
			   s2+=s1.charAt(i);
		   }
		   else
		   {
			   s3=s2+" "+s3;
			   s2="";
		   }
	   }
	   System.out.println(s3);
	}
	public static void main(String[] args) {
		String str="computer is fun";
		System.out.println(str);
		
		reverseString(str);
		
		logic2(str);
	}

}
