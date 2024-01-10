package com.twodarray;

public class OuterElement {

	public static void outerelements(int arr[][]) {


		for (int i = 0; i < 4; i++) {
			for (int j=0;j< 4;j++) {
				if(i==0||j==0||i==3||j==3) {
					System.out.print(arr[i][j] + " ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
		
	}
 
	public static void display(int arr[][])
	{
	
		for (int i = 0; i < 4; i++) {
			for (int x : arr[i]) {
				System.out.print(x + " ");
			}
			System.out.println();
		}	
	}
	public static void main(String[] args) {

		int a[][] = { { 1, 1,1,1}, { 1, 6, 7, 1}, { 1, 2, 3, 1 }, { 1, 1, 1, 1 } };
         display(a);
         System.out.println("Outer elements");
         outerelements(a);
		

	}
}