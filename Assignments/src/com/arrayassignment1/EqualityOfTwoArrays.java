package com.arrayassignment1;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	/*public static void checkequaliy(int a1[],int a2[])
	{
		int count=0;
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					count++;
				}
			}
		}
	if(count==a1.length && a1.length==a2.length)
	{
		System.out.println("Both are equal");
	}
	else
	{
		System.out.println("Both are not equal");
	}
	}
	*/
	public static void sortAr(int ar[])
	{
		int temp;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	public static void checkEqual(int a1[],int a2[])
	{
		
		sortAr(a1);
		sortAr(a2);
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		boolean status=true;
		if(a1.length!=a2.length)
		{
			status=false;
		}
		else
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]==a2[i])
				     status=true;
				else
					status=false;
				
			
			}
		}
		
		
		if(status==true)
			System.out.println("Equal");
		else
			System.out.println("Not equal");

		
	}
	public static void main(String[] args) {
		
		int arr1[]= {12,22,32,42,52,62};
		int arr2[]= {52, 22, 62, 12, 42, 22};
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(Arrays.toString(arr2));
		
		//checkequaliy(arr1, arr2);
		
		checkEqual(arr1, arr2);
		
	}

}
