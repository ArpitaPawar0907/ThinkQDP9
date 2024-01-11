package com.arraybasics;

import java.util.Arrays;

//import com.sun.tools.javac.code.Attribute.Array;

public class Demo {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		arr[0]=90;
		arr[1]=23;
		arr[2]=45;
		arr[3]=54;
		arr[4]=89;
		System.out.println("-----------------------------");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------");
		
		int arr1[]= {23,45,60,44};
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("-----------------------------");
		
		System.out.println(arr);//print hashcode
		System.out.println(Arrays.toString(arr));
		
		
	}

}
