package com.stringassingment;

public class UniqueWord {
	static void findCount(String s)
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
			if(count==1)
			System.out.println(starr[i]);
		}
	}
	public static void main(String[] args) {
		
		String str="jingle bells jingle bells jingle on the way";
		System.out.println(str);
		findCount(str);
	}


}
