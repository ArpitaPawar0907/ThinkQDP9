package com.string;

public class CountOccuranceWord {
	
	public static void countWord(String s)
	{
		int count;
		
		String starr[]=s.split("\\s");
		for(int i=0;i<starr.length;i++)
		{
			count=1;
			for(int j=i+1;j<starr.length;j++)
			{
				if(starr[i].equalsIgnoreCase(starr[j]))
					count++;
			}
			System.out.println(starr[i]+" ---"+count);
		}
	}
	public static void main(String[] args) {
		String str="rain rain come again";
		countWord(str);
	}

}
