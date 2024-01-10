package com.arrayassignment1;

public class MinimumMaximumColumn {

	public static int minVal(int a[]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

		}

		return min;
	}

	public static int maxVal(int a[]) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}

		return max;
	}

	public static void main(String[] args) {

		int arr[][] = { { 22, 31, 9 }, { 12, 25, 16 } };

		System.out.println("Maximum");
		for (int i = 0; i < arr.length; i++) {
			for (int j=0;j<arr[0].length;j++) {
				System.out.print(maxVal(arr[j]));
				break;
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		System.out.println("Minimum");
		for (int i = 0; i < arr.length; i++) {
			for (int j=0;j<arr[0].length;j++) {
				System.out.print(minVal(arr[j]));
				break;
			}
			System.out.println();
		}

	}

}
