package com.test1;

public class Question8_FibbonaciSeries {
	public static void fib()
	{
		int n1=0,n2=1,n3=0,i;
		System.out.print(n1+" "+n2);
		
		for(i=2;i<10000;)
		{
			
			
			
			n3=n1+n2;
	       
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			i=n3;
	       
	       
	    	 
	      
		}
	}
	
    public static void main(String[] args) {
		fib();
    
	}
}
