package com.priorityQueue;


import java.util.PriorityQueue;

public class CustomerQueue {

	public static void main(String[] args) {

		PriorityQueue<Customer> cpq = new PriorityQueue<Customer>(new CategoryCmparator());

		cpq.add(new Customer(1, 1, "Pranay"));
		cpq.add(new Customer(3, 3, "Reetu"));
		cpq.add(new Customer(4, 1, "Pranali"));
		cpq.add(new Customer(5, 2, "Arpita"));
		cpq.add(new Customer(1, 2, "Prachi"));
		cpq.add(new Customer(2, 3, "Baskar"));

		for (Customer c : cpq) {
			System.out.println(c);
		}
	}

}
