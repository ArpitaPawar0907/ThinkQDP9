package com.constructor;

public class Palindrome
{

     public static void checkpalindrome(int num)
     {
          int original=num;
          int rem=0;
          int count;
          while(num!=0)
               {
                 rem=num%10*10;     
                 num=num/10;
                // rev=rem+10;
              }  

       if(original==rem)
       {
       System.out.println(original+" is palindrome");
        }
       else
       {
    	    System.out.println("Not");
       }
      }
     
      public static void main(String[] args)
     {
     checkpalindrome(121);
     }

}
