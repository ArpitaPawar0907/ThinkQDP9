package com.lamdaDemo;

public class LamdaRunnable {

	public static void main(String[] args) {
		
		Runnable r1=()->System.out.println(Thread.currentThread().getName());

		Thread t=new Thread(r1);
		t.start();
		
		Runnable r2=()->{
			for(int i=0;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName());
			}
		};
		
		Thread t2=new Thread(r2);
		t2.start();
		
	
	
	}

}
