package com.twodarray;

public class LowerTriangularMatrix {

	public static void sumOfLowerTriangle(int a[][])
	{
		int sum=0;
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=0;j<i;j++)
	    	{
	    	//	System.out.print(a[i][j]);
	    		sum+=a[i][j];
	    	}
	    	//System.out.println();
	    }
	    System.out.println("Sum Of Lower Triangular matrix:"+sum);
	}
	public static void display(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j:a[i])
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		int mat[][]= {{1,2,3,4},{5,6,7,8},{2,5,3,6},{5,9,7,6}};
		display(mat);
		System.out.println("---------------------------------");
		sumOfLowerTriangle(mat);

	}

}
