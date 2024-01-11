package com.priorityQueue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Float> adq=new ArrayDeque<Float>();
		
		adq.add(78.9f);
		adq.add(34.4f);
		adq.add(98.5f);
		
		
		adq.addFirst(89.3f);
		adq.offerFirst(35.4f);
		System.out.println(adq);
		
		System.out.println(adq.peekFirst());
		System.out.println(adq.poll());
		System.out.println(adq);
		
	}

}
