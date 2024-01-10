package com.array;

import java.util.Arrays;

public class AddementsOfArray {
  
	 public static void addElements(int a[])
	 {
		 int sum=0;
		 for(int i=0;i<a.length;i++)
		 {
			 sum=sum+a[i];
		 }
		 System.out.println("Addition of element of array :"+sum);
	 }
	
	public static void main(String[] args) {
	
		int arr[]= {4,6,7,8,9,10};
	
		addElements(arr);
		System.out.println(Arrays.toString(arr));

	}

}
