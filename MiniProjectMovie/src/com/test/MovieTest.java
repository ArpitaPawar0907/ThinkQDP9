package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.MovieDaoImpl;
import com.pojo.Movie;

public class MovieTest {
	public static void main(String[] args) {

		int id;
		String mname;
		float rating;
		int choice;
		char ch;

		Movie movie;
		List<Movie> mlist = new ArrayList<Movie>();
		Scanner sc = new Scanner(System.in);

		MovieDaoImpl mdao = new MovieDaoImpl();
		do {
			System.out.println("----------Movie -------------------");
			System.out.println("---------------------------------------");
			System.out.println("1.Add Movie");
			System.out.println("2.Update Movie");
			System.out.println("3.Delete Movie");
			System.out.println("4.Show Movie list");
			System.out.println("5.Search by Movie id");
			System.out.println("---------------------------------------------");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("-----add Movie----------");
				System.out.println("How many Movie you want to add");
				int num = sc.nextInt();
				for (int i = 0; i < num; i++) {
					System.out.println("Enter Movie id");
					id = sc.nextInt();

					System.out.println("Enter name");
					mname = sc.next();

					System.out.println("Enter Rating");
					rating=sc.nextFloat();

					movie=new Movie(id, mname, rating);

				mdao.addMovie(movie);
				}
				break;
			case 2:
				System.out.println("-----update Movie-----------------");
				System.out.println("Enter Movie id");
				id = sc.nextInt();

				System.out.println("Enter name");
				mname = sc.next();

				System.out.println("Enter rating ");
				rating=sc.nextFloat();
				movie = new Movie(id, mname, rating);
				mdao.updateMovie(movie);

				break;
			case 3:
				System.out.println("-----Delete  Movie-----------------");
				System.out.println("Enter Movie id");
				id = sc.nextInt();
				mdao.deleteMovie(id);

				break;
			case 4:
				mlist =mdao.showAll();
				if (!mlist.isEmpty()) {
					System.out.println("--------Movie List--------------");
					for (Movie m : mlist) {
						System.out.println(m);
					}
				} else {
					System.out.println("Movie List is Empty");
				}
				break;
			case 5:
				System.out.println("-----Search Movie-----------------");
				System.out.println("Enter Movie id");
				id = sc.nextInt();

				movie = mdao.searchMovieById(id);
				if (movie != null) {
					System.out.println("Movie is found");
					System.out.println(movie);
				} else {
					System.out.println("No record of Movie Found");
				}
				break;

			}
			System.out.println("do u want to continue??");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

		sc.close();
	}

}
