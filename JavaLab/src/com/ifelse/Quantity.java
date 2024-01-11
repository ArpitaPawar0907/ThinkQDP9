package com.ifelse;

import java.util.Scanner;

public class Quantity {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity of product");
		int quan=sc.nextInt();
		if(quan>0)
		{
			if(quan>=50)
				System.out.println("Price is:"+(quan*100));
			else if(quan>=30)
				System.out.println("Price is :"+(quan*125));
			else
				System.out.println("Price is :"+(quan*140));
			
		}
		else
		{
			System.out.println("Invalid quantity");
		}

	}

}
