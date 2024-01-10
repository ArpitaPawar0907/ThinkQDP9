package com.twodarray;

public class TransposeMatrix {

	public static int[][] findtranspose(int a[][])
	{
		int col=a.length;//rows of a
		int row=a[0].length;//col of a
		
		int tarr[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				tarr[i][j]=a[j][i];
			}
		}
		
		return tarr;
		
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
		
		int m1[][]= {{1,2,3},{4,5,6}};
		display(m1);
		int tmat[][]=findtranspose(m1);
		display(tmat);

	}

}
