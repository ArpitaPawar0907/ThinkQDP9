package com.forLoop;

import java.util.Scanner;

public class BarrelOfFuel {
    public static void barrel()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number of barrel");
    	int i=sc.nextInt();
    	long price=1;
    	
    	for(;i<=20;i++)
    	{
    		if(i<=10)
    		{
    			price=i*89;
    			break;
    		}
    		else if(i<=20)
    		{
    			price=12*(89-12);
    			break;
    		}
    			
    	}
    	System.out.println("Barrel :"+price);
    }
    public static void main(String[] args) {
		
    	barrel();
	}
}
