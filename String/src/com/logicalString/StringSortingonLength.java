package com.logicalString;

import java.util.Arrays;

public class StringSortingonLength {

	public static void sortArrsy(String str[])
	{
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].length()==str[j].length())
				{
					if(str[i].compareTo(str[j])>0)
					{
						String temp=str[i];
						str[i]=str[j];
						str[j]=temp;
					}
				}
				else if(str[i].length()>str[j].length())
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		String arr[]= {"java","C","Angular","Python","Devlop","Koclin"};

		System.out.println("Before: "+Arrays.toString(arr));
		sortArrsy(arr);
		System.out.println("After: "+Arrays.toString(arr));
	}

}
