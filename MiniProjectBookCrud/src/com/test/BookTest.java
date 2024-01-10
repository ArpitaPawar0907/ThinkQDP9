package com.test;

import java.util.Scanner;

import com.dao.BookDaoImpl;
import com.pojo.Book;

public class BookTest {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	

		
		int choice;
		int bookid;
		String bookname;
		double bookprice;
		char ch;
		int books=0;
		Book book = null;
		BookDaoImpl bdao = new BookDaoImpl();
		do {
			System.out.println("---welcome to Library----");
			System.out.println("-----------------------------");
			System.out.println("1.add book");
			System.out.println("2.update book");
			System.out.println("3.delete book");
			System.out.println("4.show books");
			System.out.println("5.search book by id");
			System.out.println("-----------------------------");

			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("---add book---");
				System.out.println("how many book you want to add");
				books = sc.nextInt();
				for (int i = 1; i <= books; i++) {
					System.out.println("enter book id:");
					bookid = sc.nextInt();
					System.out.println("enter book name:");
					bookname = sc.next();
					System.out.println("enter book price:");
					bookprice = sc.nextDouble();
					book = new Book(bookid, bookname, bookprice);
					bdao.addBook(book);
				}
				break;
			case 2:
				System.out.println("-----update book-----------");
				
				System.out.println("enter book id:");
				bookid = sc.nextInt();
				System.out.println("enter book name:");
				bookname = sc.next();
				System.out.println("enter book price:");
				bookprice = sc.nextDouble();
				book = new Book(bookid, bookname, bookprice);
				bdao.updateBook(book);
			
				break;
			case 3:
				   System.out.println("-----Delete Book----------------");
				   System.out.println("Enter book id you want to deleted:");
				   bookid=sc.nextInt();
				   bdao.deleteBook(bookid);
				   break;
			case 4:
				if(books!=0) {
				bdao.showAllBook();
				}
				else {
					System.out.println("no book found");
				}
				break;
				
			case 5:
				System.out.println("Enter book id:");
				bookid=sc.nextInt();
				book=bdao.searchBookById(bookid);
				if(book!=null) {
					System.out.println(book);
				}
				else {
					System.out.println("please check book id");
				}
				break;
			}
			System.out.println("do u want to continue??");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}
	
	
	

}
