package com.methodcalling;

public class EvenOdd {

	public static void evenOdd(int num)
	{
		if(num%2==0)
			System.out.println("Even");
		else
			System.out.println("odd");
	}
	public static int calculate(int num1,int num2)
	{
		int sum=num1+num2;
		return sum;
	}
	public static void main(String[] args) {
	
      evenOdd(45);
      int res=calculate(3, 4);
      System.out.println(res);
      System.out.println(calculate(6,9));
	}

}
