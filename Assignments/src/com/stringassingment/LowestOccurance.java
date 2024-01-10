package com.stringassingment;

public class LowestOccurance {

	public static void checkFrequency(String s)
	{
		int count=0;
		char ch=' ';
		int minC=0;
		for(int i=0;i<s.length();i++)
		{
			count=1;
			
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
           if(count<minC)
           {
        	   minC=count;
        	   ch=s.charAt(i);
           }
		}
		
		System.out.println(ch+" has higest ouccerance");
	}

	public static void main(String[] args) {
	
		String str="java";
		checkFrequency(str);

	}

}
