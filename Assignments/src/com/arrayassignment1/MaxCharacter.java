package com.arrayassignment1;

import java.util.Arrays;

public class MaxCharacter {

	public static void checkMinChar(char ch[])
	{
		char c='A';
	   
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>c)
			{
				c=ch[i];
			}
				
		}
		System.out.println("Maximum character: "+c);
	}
	public static void main(String[] args) {
		
		char arr[] = {'A', 'D', 'E', 'x', 'z','R'};

		System.out.println(Arrays.toString(arr));
		checkMinChar(arr);
		
	}

}
