package com.exception;

public class StringArray {

	public static void printString(String starr[])
	{
		String out="";
		int pos=0;
		for(int i=0;i<starr.length;i++)
		{
			out+=starr[i].charAt(pos);
			pos++;
		}
		System.out.println("String :"+out);
	}
	public static void main(String[] args) {
		
		String str[]= {"winter","fall","summer","spring"};
		printString(str);
		
	}
}
