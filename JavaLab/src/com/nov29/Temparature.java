package com.nov29;

public class Temparature {

	public static void main(String[] args) {
		float temp=100;
		int c=0;
		while(temp>60)
		{
			temp=temp-7;
			c++;
		}
     System.out.println("Hour "+c);
	}

}
