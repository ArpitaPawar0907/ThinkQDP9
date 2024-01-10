package com.forLoop;

import java.util.Scanner;

public class MilkAndOil {
	public static void milkQuntity(int m,int o)
	{
		int ml=40,ol=50;
		int sum=0,sum2=0;
		for(int i=1;i<=m;i++)
		{
			sum=sum+ml;
		}
		for(int i=1;i<=o;i++)
		{
			sum2=sum2+ol;
		}
		
		int total=sum+sum2;
		
		if(total>500)
		{	
			System.out.println("Quntity of milk"+m+"Liters"+" :"+sum);
			System.out.println("Quntity of oil"+o+"Liters"+" :"+sum2);
		}
		    System.out.println("Thank you for buying");
		
		     
	}
    public static void main(String[] args) {
	
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Quantity of milk");
    	int m1=sc.nextInt();
    	System.out.println("Enter Quntity of oil");
    	int o1=sc.nextInt();
    	milkQuntity(m1, o1);
}
}
