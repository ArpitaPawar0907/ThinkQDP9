package com.forLoop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		

	    int temp=400;
		 do
		 {
			 
		 int num=temp;
			boolean status=true;
			
			if((num==0)||(num==1))
			{
				System.out.println(num);
			}
			
			else
			{    
				for(int i=2;i<=num/2;i++)
				{
					if(num%i==0)
					{
					
						status= false;
						break;
						
					}
				}
				
			}
				if(status)
				{
					System.out.println(num);
				}
			
				temp--;
		 }while(temp!=300);
			
		
	

	}

}
