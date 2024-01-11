package com.priorityQueue;

import java.util.Comparator;

public class CategoryCmparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
	
		
		return c1.getCategory()-c2.getCategory();
	}

}
