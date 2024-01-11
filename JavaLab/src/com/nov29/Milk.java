package com.nov29;

public class Milk {
	public static void main(String[] args) {

		int price = 40;
		int total;
		int sum;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 7; j++) {
				price += j;

			}
			System.out.println(price);
		}

	}

}
