package com.arraylogics;

import java.util.Arrays;

public class HalfSorting {
	  public static void halfSort(int a[])
	  {
		  int h=a.length/2;
		  int temp;
		  for(int i=0;i<h;i++)
		  {
			 for(int j=0;j<h;j++)
			 {
				if(a[i]>a[j])
				{
					temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
			    }
			 }
		  }
		  for(int i=h;i<a.length;i++)
		  {
			 for(int j=h;j<a.length;j++)
			 {
				if(a[i]<a[j])
				{
					temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
			    }
			 }
		  }
		  
	  }
	 	public static void main(String[] args) {
			int arr[]= {6,7,3,4,5,3,1,2};
			 System.out.println(Arrays.toString(arr));

			halfSort(arr);
			 System.out.println(Arrays.toString(arr));
		}

	}
