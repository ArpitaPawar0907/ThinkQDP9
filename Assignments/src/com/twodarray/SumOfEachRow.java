package com.twodarray;

public class SumOfEachRow {
	
	public static void sumOfRow(int a[][])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=0;
			for(int j:a[i])
			{
				sum+=j;
			}
			System.out.println((i+1)+" row sum :"+sum);
		}
	}
	public static void sumOfCol(int a[][])
	{
	
		int sum=0;
		int col=a[0].length;
		int row=a.length;
		for(int i=0;i<col;i++)
		{
			sum=0;
			for(int j=0;j<row;j++)
			{
			sum+=a[i][j];	
			}
			System.out.println((i+1)+" column sum :"+sum);
		}

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
	
		int arr[][]= {{1,2,3},{3,4,5}};
		display(arr);
		
		sumOfRow(arr);
		sumOfCol(arr);

	}

}
