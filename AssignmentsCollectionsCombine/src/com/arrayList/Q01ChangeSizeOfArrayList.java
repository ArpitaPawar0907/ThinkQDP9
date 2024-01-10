package com.arrayList;
/*
 * 1. Show in program, that size of an arraylist dynamically changes 
 */
import java.util.ArrayList;

public class Q01ChangeSizeOfArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> num=new ArrayList<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
		//default capacity is 10
		System.out.println(num);
		num.add(11);
		num.add(12);
		//after adding more elements in arraylist
		System.out.println(num);
		

	}

}
