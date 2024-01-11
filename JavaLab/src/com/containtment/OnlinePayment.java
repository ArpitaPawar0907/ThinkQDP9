package com.containtment;

import java.util.Scanner;

public class OnlinePayment {
	static Scanner sc=new Scanner(System.in);
    
   	public static void byIfElse()
	{
		int mode, ctype;
		int cvv;
		long cno;
		
		System.out.println("Enter mode of payment :\n1.cash\n2.card");
		 mode=sc.nextInt();
		if(mode==1)
		{
			System.out.println("Payment done by cash");	
		}
		else
		{
			System.out.println("Payment by card");
			System.out.println("Enter 1.credit\n2.debit card");
		     ctype=sc.nextInt();
		     if(ctype==1)
		     {
		       System.out.println("Credit card");
	    	           
	    	   System.out.println("Enter card no");
  	           cno=sc.nextLong();
  	           System.out.println("Enter cvv no");
  	           cvv=sc.nextInt();
	    	           

		     }
		     else
		     {
		    	System.out.println("Debit card");
	    	           
	    	    System.out.println("Enter card no");
  	            cno=sc.nextLong();
  	            System.out.println("Enter cvv no");
  	            cvv=sc.nextInt();
	    	   
		     }
		       
		}
	}

   	
   	public static void bySwitch() 
   	{
   		int cvv;
   		long cno;
   		String mode,card;
   		System.out.println("Enter mode of payment cash/card");
   		mode=sc.next();
   		switch(mode)
   		{
   		
   		case "cash":
   			        System.out.println("Payment done by cash");
   			        break;
   		case "card":
   			       System.out.println("Payment by card");
   			       System.out.println("Enter credit/debit card");
   			       String ctype=sc.next();
   			       
   			       switch(ctype)
   			       {
   			       case "debit":
   			    	           System.out.println("Debit card");
   			    	           
   			    	           System.out.println("Enter card no");
   			    	           cno=sc.nextLong();
   			    	           System.out.println("Enter cvv no");
   			    	           cvv=sc.nextInt();
   			    	           break;
   			       case "credit":
   			    	           System.out.println("Credit card");
   			    	           
   			    	           System.out.println("Enter card no");
			    	           cno=sc.nextLong();
			    	           System.out.println("Enter cvv no");
			    	           cvv=sc.nextInt();
   			    	           break;
   			       default:
   			    	      	   System.out.println("Invalid payment card");
   			    
   			       
   			       }
   			       
   			       
   			       break;
   	    default:
   	    	System.out.println("Invalid payment mode");
   	    	    break;
   		}
   		
   	
   		
   	}
	public static void main(String[] args) {
	 
		OnlinePayment op=new OnlinePayment();
		System.out.println("By if else");
	     byIfElse();
		System.out.println("------------------------------------");
		System.out.println("By switch case");
		 bySwitch();

	}

}
