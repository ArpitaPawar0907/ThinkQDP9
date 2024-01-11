package com.arraybasics;

import java.util.Arrays;

public class PrimeNumberinArray {

	public static boolean checkPrime(int n)
	{
		if(n==0||n==1)
			return false;
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%1==0)
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {

		int arr[]= {2,3,5,13,24,17,19,21};
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			if(checkPrime(arr[i]))
				System.out.println(arr[i]);
		}

		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!checkPrime(arr[i]))
			  sum+=arr[i];
		}
		System.out.println("Sum of prime Number :"+sum);

	}

}
