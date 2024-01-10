package com.string;

public class OccuranceOfCharacter {
	
	public static void findOccurance(String s)
	{
		int count=0;
		boolean status=false;
		for(int i=0;i<s.length();i++)
		{
			count=1;
			if(status)
				continue;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					status=true;
				}
			}
			System.out.println(s.charAt(i)+" : "+count);
		}
	}
    public static void main(String[] args) {
		String str="Google";
		findOccurance(str);
	}
}
