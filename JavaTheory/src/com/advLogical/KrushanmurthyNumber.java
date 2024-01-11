package com.advLogical;

import java.util.Scanner;

public class KrushanmurthyNumber {
     
	public static long calculateFact(int n)
	{
		long fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		
		return fact;
	}
	public static void checkKrushnmurthy(int no)
	{
		long original=no;
		
		long sum=0;
		do
		{
			int rem=no%10;
		   sum=sum+(calculateFact(rem));
		   no/=10;
		   
		}while(no!=0);
		if(original==sum)
			System.out.println(original+" is Krishanmurthy number");
		else
			System.out.println(original+" is not krishnmurthy number");
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		
		checkKrushnmurthy(num);

		sc.close();
	}

}
