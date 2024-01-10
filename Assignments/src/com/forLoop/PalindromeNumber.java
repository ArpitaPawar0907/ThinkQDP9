package com.forLoop;

import java.util.Scanner;

public class PalindromeNumber {
	

	public static void checkPalindrome(int num)
	{
		int original= num;
		int reverseNum=0;
		while(num!=0)
		{
			int r= num%10;
			
			reverseNum= (reverseNum*10)+r;
			//System.out.println(reverseNum);
			num=num/10;
			
		}
		
		if(original==reverseNum)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
		
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		checkPalindrome(n);

	}


}
