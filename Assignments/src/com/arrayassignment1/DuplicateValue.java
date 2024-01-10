package com.arrayassignment1;

import java.util.Arrays;

public class DuplicateValue {

	public static void duplicateValue(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
		    count=0;
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j])
			{
			 count++;
			 a[j]=0;
			}
			}
			}
			if(count>=1)
				System.out.println(a[i]);
			
		}
		
	}
	public static void main(String[] args) {
		
	int	arr[] = {3, 10, 90, 78, 56, 10, 78, 34, 61,10};
	System.out.println(Arrays.toString(arr));

	duplicateValue(arr);
	}

}
