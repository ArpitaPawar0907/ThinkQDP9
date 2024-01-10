package com.arrayassignment1;

public class MinimumRow {
	
	public static int minVal(int a[])
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
				
		}
		
		return min;
	}
	public static void main(String[] args) {
		
		int arr[][]= {{22, 31, 9}, {12, 25, 16}} ;
		
		for (int i = 0; i < arr.length; i++) {
			for (int x : arr[i]) {
				System.out.print(minVal(arr[i]));
				break;
			}
			System.out.println();
		}
	}

}
