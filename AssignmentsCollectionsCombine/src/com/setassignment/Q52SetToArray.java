package com.setassignment;

import java.util.Arrays;
import java.util.HashSet;

/*
 * 52. Convert set to array
 */
public class Q52SetToArray {

	public static void main(String[] args) {
		
		HashSet<Integer> num=new HashSet<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		System.out.println("Set:"+num);
		
		int[] arr=new int[num.size()];
 
		int index=0;
		for(int i:num)
		{
			arr[index]=i;
			index++;
		
		}
		
		System.out.println("Array :"+Arrays.toString(arr));
		
	}
}
