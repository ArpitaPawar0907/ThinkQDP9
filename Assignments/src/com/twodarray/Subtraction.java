package com.twodarray;

public class Subtraction {
	
	public static int[][] sub(int a1[][],int a2[][])
	{
		int row=a1.length;
		int col=a1[0].length;
		int sub[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sub[i][j]=a1[i][j]-a2[i][j];
			}
		}
		
		return sub;
		
	}
	static void display(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int x : arr[i]) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
	}

	public static void main(String[] args) {
		
		int m1[][]= {{1,2},{3,4}};
		int m2[][]= {{1,2},{3,4}};
		display(m1);
		display(m2);
		
		int result[][]=sub(m1, m2);
		System.out.println("subtraction of above matrixes");
		display(result);

	}


}
