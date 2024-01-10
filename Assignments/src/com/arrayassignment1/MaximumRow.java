package com.arrayassignment1;

public class MaximumRow {
	
	public static int maxVal(int a[])
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
				
		}
		
		return max;
	}
	public static void main(String[] args) {
		
		int arr[][]= {{22, 31, 9}, {12, 25, 16}} ;
		
		for (int i = 0; i < arr.length; i++) {
			for (int x : arr[i]) {
				System.out.print(maxVal(arr[i]));
				break;
			}
			System.out.println();
		}
	}

}
