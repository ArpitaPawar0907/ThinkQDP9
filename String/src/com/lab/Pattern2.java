package com.lab;



public class Pattern2 {
     
	public static void printPattern(String s)
	{
	/// String temp[]=s.split(" ");
	 
	// System.out.println(Arrays.toString(temp));
		int sp1=s.indexOf(' ');
		int sp2=s.lastIndexOf(' ');
		s=s.toUpperCase();
		System.out.println(s.charAt(0)+"."+s.charAt(sp1+1)+"."+s.charAt(sp2+1)+".");
		
		
	}
	public static void secondPattern(String s)
	{
		int sp1=s.indexOf(' ');
		int sp2=s.lastIndexOf(' ');
		System.out.println(s.charAt(0)+"."+s.charAt(sp1+1)+"."+s.substring(sp2+1, s.length()));
		
		
	}
	public static void thirdPattern(String s)
	{
		
		int sp1=s.indexOf(' ');
		int sp2=s.lastIndexOf(' ');
		System.out.println(s.substring(sp2+1,s.length())+" "+s.substring(0, sp1)+" "+s.substring(sp1+1, sp2));
	}
	public static void main(String[] args) {
		String name="sachin ramesh tedulkar";
		printPattern(name);
        //System.out.println(name);
		secondPattern(name);
		thirdPattern(name);
	}

}
