package com.string;

public class ReplaceLastOccurance {
	public static void findOccurace(String s, char c) {
		char ch[] = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == c) {
				ch[i] = '#';
				break;
			}
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {

		String str = "";
		char ch = 'a';
		findOccurace(str, ch);

	}

}
