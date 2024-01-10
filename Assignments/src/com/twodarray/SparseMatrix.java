package com.twodarray;

public class SparseMatrix {
	
	public static void checkSparseMatrix(int a[][])
	{
		int count=0;
		int size=(a.length*a[0].length);
		System.out.println(size);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==0)
					count++;
			}
		}
		
		if(count>(size/2))
		{
			System.out.println("matrix is sparse matrix");
		}
		else
		{
			System.out.println("matrix is not sparse matrix");
		}
	}

	public static void main(String[] args) {
		int m1[][]= {{1,0},{0,0}};
		//System.out.println(m1.length);
		checkSparseMatrix(m1);

	}

}
