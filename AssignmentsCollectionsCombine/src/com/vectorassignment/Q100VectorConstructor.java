package com.vectorassignment;

import java.util.Vector;

/*
 * 100. Create vector using all its constructors
 */
public class Q100VectorConstructor {

	public static void main(String[] args) {

		Vector<String> color = new Vector<>();

		color.add("red");
		color.add("pink");
		System.out.println("Default :" + color);

		Vector<Integer> num = new Vector<>(12);
		num.add(1);
		num.add(2);
		num.add(3);

		System.out.println("Capacity:" + num);
		Vector<Integer> num2 = new Vector<>(num);
		System.out.println("By passing collection:" + num2);

		Vector<Integer> num3 = new Vector<Integer>(2, 3);

		num3.add(4);
		num3.add(4);
		num3.add(4);
		num3.add(4);
		
		System.out.println("With increment:"+num3);

	}

}
