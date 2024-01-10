package com.queueassignment;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * 86. Create queue using all constructors.

 */
public class Q86ConstrutorOfQueue {
	
	public static void main(String[] args) {
		
		Queue<String> numbers=new PriorityQueue<String>();
		
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		numbers.add("four");
		numbers.add("five");
		System.out.println("1)default constructor"+numbers);
		
	    Queue<Integer> num=new PriorityQueue<Integer>(3);
	    
	    num.add(1);
	    num.add(2);
	    num.add(3);
	    System.out.println("2)Initial capacity :"+num);
	    
	    Queue<Integer> num2=new PriorityQueue<Integer>(num);
	    
	    System.out.println("3)passing collectoin:"+num2);
	    
	    
	}

}
