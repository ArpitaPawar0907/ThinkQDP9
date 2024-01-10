package com.stringassingment;

public class UniqueEmail {

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
		
	   String str1[]={"mamta@gmail.com", "pratik@gmail.com","vivek@gmail.com"};

		String str2[]={"pratik@gmail.com","vivek@gmail.com","priya@gmail.com","bhushan@gmail.com"};
		compareString(str1, str2);
	}
}
