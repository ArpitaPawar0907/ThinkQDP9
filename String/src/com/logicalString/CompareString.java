package com.logicalString;

public class CompareString {

	public static void compareString(String st1[],String st2[])
	{
		boolean found;
		for(String s1:st2)
		{
			found=false;
			for(String s2:st1)
			{
				if(s1.equals(s2))
				{
					found=true;
					break;
				}
			}
			if(!found)
				System.out.println(s1);
		}
	}
	public static void main(String[] args) {
		String st[]= {"jyoti","Reetu","Pranay","prachi"};
		String st2[]= {"nisha","Reetu","prachi","vikas","Pooja"};
       compareString(st, st2);
     
	}

}
