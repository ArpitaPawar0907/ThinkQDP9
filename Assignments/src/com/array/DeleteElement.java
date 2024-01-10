package com.array;

import java.util.Arrays;

public class DeleteElement {

	public static void deleteIndexElement(int a[],int num)
	{
	
		
		for(int i=0;i<a.length;i++)
		{
			if(i==num)
			{
				a[i]=a[i+1]; 	
			}
			else
				continue;
			
			
		}
		
		
	}
	
	
	public static void tempArray(int a[],int num)
	{
		int temp[]=new int[a.length-1];
		int pos=0;
		for (int i = 0; i < temp.length; i++)
		{
			if(i==num)
			{
				temp[i]=a[pos+1];
				pos++;
			}
			else
			{
				temp[i]=a[pos];
				pos++;
			}
		}
		
		System.out.println(Arrays.toString(temp));
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,7,6};
		
		System.out.println(Arrays.toString(arr));
		//deleteIndexElement(arr, 4);
		//System.out.println(Arrays.toString(arr));
		tempArray(arr, 1);

	}

}
