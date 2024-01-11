package com.constructor;

public class AmstrongNumber {
	
	public static int digits(int num)
	{
		int count=0;
		
		while(num>=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public static int checkPower(int num,int c)
	{
	int  result=1;
	System.out.println("checkPower");
        for(int i=1;i<=c;i++)
		{
			result=result*num;
		
		}
		return result;
					
	}
	public static void checkAmstrong(int num)
	{
		int original=num;
		
		int sum=0;
		int count=digits(num);
		int rem;
	System.out.println("amstomg");
		while(num>=0)
		{  
		System.out.println("while");
			 rem=num%10;
			sum=sum+checkPower(rem,count);
			num=num/10;
		
		}
		
		if(original==sum)
		{
			System.out.println(original+" is Amstrong number");
		}
		else
		{
			System.out.println("Not amstrong number");
		}
		
	}
	
	

	public static void main(String[] args) {
		
		
		checkAmstrong(153);
	

	}

}
