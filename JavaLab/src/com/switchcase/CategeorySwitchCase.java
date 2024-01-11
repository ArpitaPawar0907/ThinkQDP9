package com.switchcase;

import java.util.Scanner;

public class CategeorySwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("E-Commerce App");
		System.out.println("1.Mens");
		System.out.println("2.Womens");
		System.out.println("3.Kides");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			  System.out.println("Welcome to mens section");
			  System.out.println("Following are sub Categeories");
			  System.out.println("1.Footware");
			  System.out.println("2.T-shirt");
			  System.out.println("Enter your choice");
			  ch=sc.nextInt();
			  switch(ch)
			  {
			  case 1:
				  System.out.println("You have chosed Footware");
				  break;
			  case 2:
				    System.out.println("You have chosed T-shirt");
			          break;
			   default:
				   System.out.println("Invalid choice");
			  }
			  break;
		case 2:
			System.out.println("Welcome to Womens");
			System.out.println("1.Jewellary");
			System.out.println("2.Saree");
			System.out.println("Enter your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("You have chosed Jewellary");
				break;
			case 2:
				 System.out.println("You have chosed Saree");
			     break;
			 default:
				  System.out.println("Invalid choice");
			}
			break;
		case 3:
			 System.out.println("Welcome to kids");
			 System.out.println("1.Toys");
			 System.out.println("2.Educational product");
			 System.out.println("Enter your choice");
			 ch=sc.nextInt();
			 switch(ch)
			 {
			 case 1:
				 System.out.println("You have chosed toys");
				 break;
			 case 2:
				 System.out.println("You have chosed educational product");
				 break;
			 default:
					 System.out.println("Invalid Choice");
					 break;
			 }
			 break;
			default :
				System.out.println("Sorry! invalid choice");
				break;
		}

	}

}
