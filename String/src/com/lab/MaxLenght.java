package com.lab;

public class MaxLenght {
	
     public static void findmaxlenght(String s)
     {
    	String temp[]=s.split(" ");
    	String max="";
    	for(int i=0;i<temp.length;i++)
    	{
    		if(temp[i].length()>max.length())
    			max=temp[i];
    	}
    	System.out.println("maximum lenght String :"+max);
     }
	public static void main(String[] args) {
		
		String str="i love java programing";
		System.out.println(str);
		findmaxlenght(str);
		

	}

}
