package com.wordlogics;

public class ReverseExceptFirstAndLast {
//i like to learn java   
	public static void reverseString(String st) {
		String starr[] = st.split("\\s");
		String rev = "";
		rev=rev+starr[0]+" ";
		for (int i = 1; i < starr.length-1; i++) {
			for (int j = starr[i].length()-1; j >= 0; j--) 
			{
             rev+=starr[i].charAt(j);
			}
			rev+=" ";
		}
		rev+=starr[starr.length-1];
		System.out.println(rev);
	}

	public static void main(String[] args) {

		String str = "I like to learn java";
		System.out.println(str);
		reverseString(str);

	}

}
