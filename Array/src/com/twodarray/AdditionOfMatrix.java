package com.twodarray;

public class AdditionOfMatrix {

	public static int[][] add(int a1[][],int a2[][])
	{
		int row=a1.length;
		int col=a1[0].length;
		int add[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				add[i][j]=a1[i][j]+a2[i][j];
			}
		}
		
		return add;
		
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
		
		int result[][]=add(m1, m2);
		System.out.println("Addition of above matrixes");
		display(result);

	}

}
