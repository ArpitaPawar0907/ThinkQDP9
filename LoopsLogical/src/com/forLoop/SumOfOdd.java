package com.forLoop;

public class SumOfOdd {
  public static int oddNumber(int num)
  {
	  int sum=0;
	  for(int i=0;i<=num;i++)
	  {
		  if(i%2!=0)
		  sum+=i;
	  }
	  
	  return sum;
  }
	public static void main(String[] args) {
		
		System.out.println("Sum of odd number"+oddNumber(20));

	}

}
