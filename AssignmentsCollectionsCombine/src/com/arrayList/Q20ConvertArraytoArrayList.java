package com.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 20. Write a java program to convert array to arraylist and 
arraylist to array.
 */
public class Q20ConvertArraytoArrayList{

	public static void main(String[] args) {
		
		ArrayList<Integer> number=new ArrayList<>();
		
		number.add(23);
		number.add(45);
		number.add(54);
		number.add(87);
		number.add(18);
		number.add(99);
		number.add(26);
		
		System.out.println("Array List:"+number);
		Object[] arr=number.toArray();
		
		System.out.println("Array :"+Arrays.toString(arr));
		
		
		

	}

}
