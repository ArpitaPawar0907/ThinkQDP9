package com.stringbufferbuilder;

public class StringBufferExample {
	
	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());
        
		StringBuffer s2=new StringBuffer(4);
		System.out.println(s2.capacity());
      s2.append("javac");
      System.out.println(s2+" "+s2.capacity());
      System.out.println(s2+" "+s2.length());
	   
	}

}