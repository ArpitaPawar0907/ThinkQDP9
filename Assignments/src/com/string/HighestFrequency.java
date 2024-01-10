package com.string;

public class HighestFrequency {

	public static void checkFrequency(String s)
	{
		int count=0;
		char ch=' ';
		int maxC=0;
		for(int i=0;i<s.length();i++)
		{
			count=1;
			
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
           if(count>maxC)
           {
        	   maxC=count;
        	   ch=s.charAt(i);
           }
		}
		
		System.out.println(ch+" has higest ouccerance");
	}
	public static void main(String[] args) {
		
		String str="mornning";
		System.out.println(str);
		checkFrequency(str);
		

	}

}
