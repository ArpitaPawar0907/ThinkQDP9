package com.forLoop;

public class ProductOfEvenNumber {
      public static long product(int num)
      {
    	  long res=1;
    	  for(int i=1;i<=num;i++)
    	  {
    		  if(i%2==0)
    			  res=res*i;
    		  
    	  }
    	  return res;
      }
	
	public static void main(String[] args) {
	
		System.out.println("Product is"+product(6));

	}

}
