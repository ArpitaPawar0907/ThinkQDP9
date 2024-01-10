package com.arrayList;

import java.util.ArrayList;

/*
 * 2. Create a arraylist of integers. Add first 50 odd numbers to 
arraylist. 
 */
public class Q02OddNumber {

	public static void main(String[] args) {
		
		ArrayList<Integer> oddNum=new ArrayList<>();
		
		for(int i=1;i<100;i++)
		{
			if(i%2!=0)
				oddNum.add(i);
		}
		
		System.out.println(oddNum);
	}

}
