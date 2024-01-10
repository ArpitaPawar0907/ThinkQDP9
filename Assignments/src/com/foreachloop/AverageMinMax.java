package com.foreachloop;

public class AverageMinMax {


	public static int average(int a[])
	{
		int sum=0;
		int avg;
		for(int i:a)
		{
			sum+=i;
		}
		sum=sum-(minVal(a)+maxVal(a));
		avg=sum/a.length;
		
		return avg;
	}
	public static int minVal(int a[])
	{
		int min=0;
		for(int i:a)
		{
			if(i<min)
			{
				min=i;
			}
				
		}
		
		return min;
	}
	public static int maxVal(int a[])
	{
		int max=0;
		for(int i:a)
		{
			if(i>max)
			{
				max=i;
			}
				
		}
		
		return max;
	}
	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5,6};
		
		average(arr);
		

	}

}
