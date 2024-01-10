package com.string;

import java.util.Scanner;

/*
 * 10.	Write a Java program to find first occurrence of a character in a given string.
 */
public class FirstOccurance {

	public static void main(String[] args) {

		String firstCharStr;
		char ch;
		int i = 0, flag = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter String to Find First Char Occur =  ");
		firstCharStr = sc.nextLine();

		System.out.print("\nEnter the Character to Find =  ");
		ch = sc.next().charAt(0);

		while (i < firstCharStr.length()) {
			if (firstCharStr.charAt(i) == ch) {
				flag++;
				break;
			}
			i++;
		}
		if (flag == 0) {
			System.out.println("\nSorry! We haven't found the Character ");
		} else {
			System.out.println("Character found");
		}

	}

}
