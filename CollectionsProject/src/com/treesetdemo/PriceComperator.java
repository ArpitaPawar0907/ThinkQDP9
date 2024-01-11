package com.treesetdemo;

import java.util.Comparator;

public class PriceComperator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getPrice()-o2.getPrice());
	}

	
}
