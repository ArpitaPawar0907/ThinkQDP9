package com.wordlogics;

public class FrequencyOfWord {

	static void findFrequency(String s)
	{
		String starr[]=s.split(" ");
		int count;
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
			System.out.println(starr[i]+" :"+count);
		}
	}
	public static void main(String[] args) {
		
		String str="A big cat is on the big a mat where thre is a small cat";
		System.out.println(str);
		findFrequency(str);
	}
}
