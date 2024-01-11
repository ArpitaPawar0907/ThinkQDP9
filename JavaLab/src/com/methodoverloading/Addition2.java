package com.methodoverloading;

public class Addition2 {
	void add(float num1,int num2)
	{
		System.out.println("Additon (float,int)"+(num1+num2));
	}
	void add(int num1,float num2)
	{
		System.out.println("Additon (int float)"+(num1+num2));
	}
	public static void main(String[] args) {
		
       Addition2 a2=new Addition2();
       
      // a2.add(12,12);
       a2.add(12f, 1);
       a2.add(12, 2f);
	}

}
