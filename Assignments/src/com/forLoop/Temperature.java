package com.forLoop;

public class Temperature {
	public static void tempDegree()
	{
		int count=0;
		for(int i=100;i>=0;i-=7)
		{
			count++;
			if(i<=60)
			{
				System.out.println(i+" hours is"+count);
			    break;
			}
		}
			
	}
	public static void main(String[] args) {
		
		tempDegree();
	}

}
