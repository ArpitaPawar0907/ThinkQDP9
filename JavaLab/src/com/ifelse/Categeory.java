package com.ifelse;

import java.util.Scanner;

public class Categeory {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Welcome to flipcart");
		System.out.println("Following are categeories");
		System.out.println("1.Men");
		System.out.println("2.Women");
		System.out.println("3.Kides");
		System.out.println("Please Enter your choice");
		ch=sc.nextInt();
		if(ch==1)
		{
			System.out.println("Welcome to Mens Section");
			System.out.println("Following are sub Categeories");
			System.out.println("1.Footware");
			System.out.println("2.T shirts");
			System.out.println("enter your choice");
			ch=sc.nextInt();
			if(ch==1)
				System.out.println("you have chosed footware ");
			else if(ch==2)
				System.out.println("You have choosed t-shirt");
			else
				System.out.println("Sorry your choice is invalid");
		}
		else if(ch==2)
		{
			System.out.println("Welcome to Womens Section");
			System.out.println("Followinf are sub categeories");
			System.out.println("1.Jewallry");
			System.out.println("2.saree");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			if(ch==1)
				System.out.println("you have choosed jewllary");
			else if(ch==2)
				System.out.println("you have choosed saree");
			else
				System.out.println("Sorry your choice is invalid");
		}
		else if(ch==3)
		{
			System.out.println("welcome to Kids section ");
			System.out.println("following are sub categeories ");
			System.out.println("1.Toys");
			System.out.println("2.eduactinal product");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			if(ch==1)
				System.out.println("You have choosed toys");
			else if(ch==2)
				System.out.println("you have choosed educational product");
			else
				System.out.println("Sorry your choice is invalid");
		}
		else 
			System.out.println("Sorry your chioce is invalid");

	}

}
