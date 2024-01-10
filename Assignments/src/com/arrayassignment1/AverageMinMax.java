package com.arrayassignment1;

public class AverageMinMax {


	public static int average(int a[])
	{
		int sum=0;
		int avg;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		sum=sum-(minVal(a)+maxVal(a));
		avg=sum/a.length;
		
		return avg;
	}
	public static int minVal(int a[])
	{
		int min=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
				
		}
		
		return min;
	}
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
	
		int arr[]= {1,2,3,4,5,6};
		average(arr);

	}

}
