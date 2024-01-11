package com.basics;

import java.util.Arrays;

public class Removefirstoccurword 
{
    public static void firstremoveword(String st,String word)
    {
    	String[] s=st.split("\\s");
    
    	for(int i=s.length-1;i>=0;i--)
    	{
    		if(s[i].equals(word))
    		{
    		  s[i]=" ";
    		  break;
    		}
    		  		
    	}
    	//String s1=new String();
    	System.out.println(Arrays.toString(s));
    	
    	
    }
	public static void main(String[] args) {
	String st="love light love";
	String word="love";
	firstremoveword(st, word);

	}

}
