package com.test1;

public class Question11_HarshadNumber {
	public static void harshadNumber(int num)
	{
		int sum=0;
		int original=num;
		
		while(num>0)
		{
			
			sum=sum+(num%10);
			num=num/10;
		}
		if(original%sum==0)
		System.out.println("Harshad Number");
		else
			System.out.println("Not Harshad number");
	}
	public static void main(String[] args) {
		
		harshadNumber(200);
		
	}

}
