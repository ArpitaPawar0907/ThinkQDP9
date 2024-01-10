package com.stringassingment;

public class UniqueCharacter {
	
	public static void checkFrequency(String s)
	{
		int count;
		boolean found;
		for(int i=0;i<s.length();i++)
		{
			
			count=1;
			found=false;
			
			if(found==false)
			{
				for(int j=i+1;j<s.length();j++)
				{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					found=true;
				}
			}
				if(count==1)
			System.out.println(s.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		String str="array";
		checkFrequency(str);
	}

}
