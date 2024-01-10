package com.stringassingment;

public class HighestFrequencyOfSameChar {
	
	public static void findHihestFreuency(String s)
	{
		int highFrq=0;
		int i,frq;
		for(i=0;i<s.length();i++)
		{
			frq=highFre(s,s.charAt(i));
			if(highFrq<frq)
			{
				highFrq=frq;
			}		
		}
		for(i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			if(ch1!=' ')
			{
				frq=highFre(s, ch1);
				if(frq==highFrq)
					System.out.println(ch1);
			}
			s=s.replace(ch1, ' ');
		}
		
	}
	public static int highFre(String s,char ch)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
				count++;
		}
	return count;	
	}
	public static void main(String[] args) {
		
		String str="aabbceeeeffff";
		findHihestFreuency(str);
		
	}

}
