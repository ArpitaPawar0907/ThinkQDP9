package allLogiaclQuestions;

import java.util.Scanner;

public class SwapVaribleUsingThird {

	public static void swapping(int num1,int num2)
	{
		int temp;
		System.out.println("Before swapping ");
		System.out.println("Num1:"+num1);
		System.out.println("Num2:"+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping ");
		System.out.println("Num1:"+num1);
		System.out.println("Num2:"+num2);
	
	}
	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number 1 ");
     int n1=sc.nextInt();
     System.out.println("Enter Number 2 ");
     int n2=sc.nextInt();
     swapping(n1, n2);
	
	}

}
