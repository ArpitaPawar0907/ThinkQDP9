package com.staticDemo;


class Counter
{
	int data;
	static int counter=0;
	{
		counter++;
	}
	Counter()
	{
		data=10;
	}
	Counter(int data)
	{
		this.data=data;
	}
}

public class HitCounter {

	public static void main(String[] args) {
		
		Counter c1=new Counter();
		
		System.out.println("Data:"+c1.data);
		System.out.println("Counter:"+Counter.counter);
		
		Counter c2=new Counter(45);
		System.out.println("Data:"+c2.data);
		System.out.println("Counter:"+Counter.counter);
		
		Counter c3=new Counter();
		System.out.println("Data:"+c3.data);
		System.out.println("Counter:"+Counter.counter);
		
		
	}

}
