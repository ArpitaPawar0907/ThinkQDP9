package com.nov27;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean checkPrime(int num)
	{
		 
			boolean status=true;
			
			if((num==0)||(num==1))
			{
				status=false;
			}
			
			else
			{    
				for(int i=2;i<=num/2;i++)
				{
					if(num%i==0)
					{
					
						status= false;
						break;
						
					}
				}
				
			}
				
			return status;
}
       
	public static void range(int n1,int n2)
	{
		
		for(int i=n1;i<=n2;i++)
		{
		 
			if(checkPrime(i)==true)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting range no");
		int n1=sc.nextInt();
		System.out.println("Enter ending range no");
		int n2=sc.nextInt();
       range(n1,n2);
	}

}
