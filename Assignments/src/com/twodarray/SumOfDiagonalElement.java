package com.twodarray;

public class SumOfDiagonalElement {

	public static void calSumOfDiagonal(int a[][])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
			   if(i==j)
			   {
				  sum=sum+a[i][j];
			   }
			}
		}
		System.out.println("Sum of Diagonal element :"+sum);
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
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		display(arr);
		System.out.println("-----------------------------------");
		calSumOfDiagonal(arr);

	}

}
