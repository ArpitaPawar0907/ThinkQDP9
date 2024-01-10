package com.array;

import java.util.Arrays;

public class Averagevage {
  
	 public static void average(int a[])
	 {
		 int sum=0,avg;
		 for(int i=0;i<a.length;i++)
		 {
			 sum=sum+a[i];
		 }
		 avg=sum/(a.length);
		 System.out.println("Avreage of array:"+avg);
	 }
	
	public static void main(String[] args) {
	
		int arr[]= {4,6,7,8,9,10};
	
	     average(arr);
		System.out.println(Arrays.toString(arr));

	}

}
