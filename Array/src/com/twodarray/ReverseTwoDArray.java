package com.twodarray;

public class ReverseTwoDArray {

	public static void reveseArray(int a[])
	{
		int temp;
		int len=a.length/2;
		for (int i = 0; i <len ; i++) {
			
			temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
	}
	public static void reverse2D(int arr[][])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			reveseArray(arr[i]);
		}
	}
	
	public static void display(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int a:arr[i])
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	
		int m1[][]= {{1,2,3},{4,5,6}};
		
		display(m1);
		reverse2D(m1);
		display(m1);

	}

}
