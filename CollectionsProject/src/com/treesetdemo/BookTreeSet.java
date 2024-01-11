package com.treesetdemo;

import java.util.TreeSet;

public class BookTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Book> ts=new TreeSet<>(new PriceComperator());
		
		ts.add(new Book(101,"Hamlet", 350));
		ts.add(new Book(102,"Julius Ceiser", 560));
		ts.add(new Book(103,"Life", 480));
		ts.add(new Book(104,"Secret", 700));
		
		for(Book b:ts)
		{
			System.out.println(b);
		}

	}

}
