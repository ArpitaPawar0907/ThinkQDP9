package com.wordlogics;

import java.util.Arrays;

public class SpiltsMethod {

	public static void main(String[] args) {
		//

		String s1="I love to\t learn java";
		//String arr[]=s1.split(" ");
		
		//String arr[]=s1.split("\\s");//for space
		String arr[]=s1.split("\\t");
		System.out.println(Arrays.toString(arr));
		
		String s2="I love java.I am study in tq";
		String arr2[]=s2.split("\\.");
		System.out.println(Arrays.toString(arr2));

	}

}
