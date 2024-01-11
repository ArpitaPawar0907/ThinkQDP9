package com.wordlogics;

public class MostRepeatedWord {

	static void findFrequency(String s)
	{
		String starr[]=s.split(" ");
		int count;
		int maxC=0;
		String st="";
		for(int i=0;i<starr.length;i++)
		{
			count=1;
			if(starr[i].equals("visited"))
				continue;
			for(int j=i+1;j<starr.length;j++)
			{
				if(starr[i].equalsIgnoreCase(starr[j]))
				{
					count++;
					starr[j]="visited";
					
				}
			}
		if(count>maxC)
		{
			maxC=count;
		 st=starr[i];
		}
		}
		System.out.println("Most repeated String is "+st+" "+maxC);
	}
	public static void main(String[] args) {
		
		String str="jingle bells jingle bells jingle on the way";
		System.out.println(str);
		findFrequency(str);
	}
}
