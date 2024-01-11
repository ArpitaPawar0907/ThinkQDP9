package com.methodoverloading;

public class MainClass2 {

	double overLoadedMethod(double d)
	{
		return d*d;
	}
	int overLoadedMethod(int i)
	{
		return overLoadedMethod(i*=i);
	}
	float overLoadedMethod(float f)
	{
		return overLoadedMethod(f*=f);
	}
	public static void main(String[] args) {
	
		MainClass2 main=new MainClass2();
		System.out.println(main.overLoadedMethod(100));

	}

}
//exception
